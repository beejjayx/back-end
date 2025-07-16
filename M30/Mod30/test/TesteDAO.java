import domain.Cliente;

public class TesteDAO {

    public static void main(String[] args) throws Exception {
        ClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("666");
        cliente.setNome("Benji");

        // Teste do cadastro
        dao.cadastrar(cliente);

        // Teste da consulta
        Cliente resultado = dao.consultar("666");
        System.out.println("Nome encontrado: " + resultado.getNome());

        // Teste de atualização
        cliente.setNome("Benji Atualizado");
        dao.atualizar(cliente);

        // Teste para buscar todos
        dao.buscarTodos().forEach(c -> System.out.println(c.getNome()));

        // Teste de exclusão
        dao.excluir(cliente);

        // Teste do Celular 
        cliente.setCelular("99999-9999");
        System.out.println("Celular: " + resultado.getCelular());        
    }

    
}
