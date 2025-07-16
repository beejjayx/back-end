import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import jdbc.ConnectionFactory;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Integer cadastrar(Cliente cliente) throws Exception {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stm = connection.prepareStatement(
                "INSERT INTO TB_CLIENTE_2 (ID, CODIGO, NOME, CELULAR) VALUES (nextval('SQ_CLIENTE_2'),?,?)")) {
            
            stm.setString(1, cliente.getCodigo());
            stm.setString(2, cliente.getNome());
            stm.setString(2, cliente.getCelular());
            return stm.executeUpdate();
        }
    }

    @Override
    public Cliente consultar(String codigo) throws Exception {
        Cliente cliente = null;

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stm = connection.prepareStatement(
                "SELECT * FROM TB_CLIENTE_2 WHERE CODIGO = ?")) {

            stm.setString(1, codigo);
            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    cliente = new Cliente();
                    cliente.setId(rs.getLong("id"));
                    cliente.setCodigo(rs.getString("codigo"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCelular(rs.getString("celular"));
                }
            }
        }
        return cliente;
    }

    @Override
    public Integer excluir(Cliente cliente) throws Exception {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stm = connection.prepareStatement(
                "DELETE FROM TB_CLIENTE_2 WHERE CODIGO = ?")) {

            stm.setString(1, cliente.getCodigo());
            return stm.executeUpdate();
        }
    }

	@Override
	public List<Cliente> buscarTodos() throws Exception {
		List<Cliente> clientes = new ArrayList<>();

		try (Connection connection = ConnectionFactory.getConnection();
			PreparedStatement stm = connection.prepareStatement("SELECT * FROM TB_CLIENTE_2");
			ResultSet rs = stm.executeQuery()) {

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong("id"));
				cliente.setCodigo(rs.getString("codigo"));
				cliente.setNome(rs.getString("nome"));
				clientes.add(cliente);
			}
    }
    return clientes;
}

	@Override
	public Integer atualizar(Cliente cliente) throws Exception {
		try (Connection connection = ConnectionFactory.getConnection();
			PreparedStatement stm = connection.prepareStatement(
				"UPDATE TB_CLIENTE_2 SET NOME = ? WHERE CODIGO = ?")) {
			
			stm.setString(1, cliente.getNome());
			stm.setString(2, cliente.getCodigo());
			stm.setString(2, cliente.getCelular());
			return stm.executeUpdate();
		}
	}

}


