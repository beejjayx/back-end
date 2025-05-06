package javaapplication1.dao;


import javaapplication1.domain.Cliente;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


// Declara a classe ClienteMapDAO, que implementa a interface IClienteDAO
// Ou seja, essa classe é responsável por fornecer a lógica real dos métodos definidos na interface
public class ClienteMapDAO implements IClienteDAO {

    // Declara um atributo privado do tipo Map, onde:
    // - A chave (Key) é do tipo Long, que representa o cpf do cliente
    // - O valor (Value) é um objeto Cliente
    // Esse mapa será usado para armazenar os clientes na memória
    private final Map<Long, Cliente> map;

    // Construtor da classe ClienteMapDAO
    // Inicializa o atributo 'map' criando um novo HashMap, permitindo que clientes sejam armazenados em pares (cpf -> Cliente)
    public ClienteMapDAO() {
        this.map = new HashMap();
    }



    // Método CADASTRAR CLIENTE
    // Sobrescreve o método cadastrar() da interface IClienteDAO
    // Faz a verificação se o cpf já existe antes de adicionar
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey((cliente.getCpf()))) {
            return false; // Se o cpf já existir no mapa, ele não adiciona o cliente e retorna false
        }

        //adiciona o cliente no HashMap, usando o cpf como chave (Long) e o próprio objeto Cliente como valor.
        // Isso permite acessar rapidamente um cliente específico pelo cpf.
        this.map.put((Long) cliente.getCpf(), cliente);
        return true; //confirma que o cliente foi cadastrado corretamente.
    }



    // Método EXCLUIR CADASTRO
    // Sobrescreve o método excluir() da interface IClienteDAO
    // Este método recebe um cpf (chave única) e remove o cliente do armazenamento se ele existir
    @Override
    public void excluir(Long cpf) {
        // Busca no mapa se existe um cliente cadastrado com o cpf informado
        // Se existir, ele será armazenado na variável clienteCadastrado
        Cliente clienteCadastrado = this.map.get(cpf);

        // Verifica se o cliente realmente existe antes de tentar removê-lo
        if (clienteCadastrado != null) {
            // Remove o cliente do mapa usando seu cpf como chave e o próprio objeto como valor
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }



    //Método ATUALIZAR CADASTRO
    // Sobrescreve o método alterar() da interface IClienteDAO
    // Ele permite atualizar as informações de um cliente cadastrado no mapa
    @Override
    public void alterar(Cliente cliente) {
        // Busca no mapa se existe um cliente cadastrado com o cpf informado
        // Se existir, ele será armazenado na variável clienteCadastrado
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());

        // Verifica se o cliente realmente existe antes de tentar alterá-lo
        if (clienteCadastrado != null) {
            // Atualiza os dados do cliente usando o novo valor passado no objeto cliente
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }



    // Método CONSULTAR CLIENTE
    // Sobrescreve o método consultar() da interface IClienteDAO
    // Esse método recebe um cpf como parâmetro e retorna o Cliente correspondente, caso esteja cadastrado

    @Override
    public Cliente consultar(Long cpf) {
        // Busca no HashMap pelo cpf (chave) e retorna o objeto Cliente armazenado nesse cpf
        // Se o cpf não existir no mapa, o método retornará null
        return this.map.get(cpf);
    }



    // Método BUSCAR CLIENTE
    // Sobrescreve o método buscarTodos() da interface IClienteDAO
    // Esse método retorna todos os clientes cadastrados no mapa

    @Override
    public Collection<Cliente> buscarTodos() {
        // Retorna a coleção de clientes armazenados no HashMap
        // O método values() retorna todos os valores (Clientes) sem precisar acessar cada chave (cpf)
        return this.map.values();
    }
}
