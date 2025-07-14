import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Produto;
import jdbc.ConnectionFactory;


public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Produto buscar(String codigo) throws Exception {
        Produto produto = null;

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stm = connection.prepareStatement(
                 "SELECT * FROM TB_PRODUTO WHERE CODIGO = ?")) {

            stm.setString(1, codigo);
            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    produto = new Produto();
                    produto.setId(rs.getLong("id"));
                    produto.setCodigo(rs.getString("codigo"));
                    produto.setNome(rs.getString("nome"));
                    produto.setValor(rs.getBigDecimal("valor"));
                }
            }
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        List<Produto> produtos = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stm = connection.prepareStatement("SELECT * FROM TB_PRODUTO");
             ResultSet rs = stm.executeQuery()) {

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getBigDecimal("valor"));
                produtos.add(produto);
            }
        }
        return produtos;
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stm = connection.prepareStatement(
                 "DELETE FROM TB_PRODUTO WHERE CODIGO = ?")) {

            stm.setString(1, produto.getCodigo());
            return stm.executeUpdate();
        }
    }
}
