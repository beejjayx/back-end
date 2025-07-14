import java.util.List;

import domain.Cliente;

public interface IClienteDAO {

    Integer cadastrar(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;

    Integer excluir(Cliente clienteBD) throws Exception;

    List<Cliente> buscarTodos() throws Exception;

    Integer atualizar(Cliente cliente) throws Exception;
}
