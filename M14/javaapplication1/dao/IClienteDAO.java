package javaapplication1.dao;


import javaapplication1.domain.Cliente;
import java.util.Collection; 


// Declaração da interface IClienteDAO
// Interfaces são usadas para definir um conjunto de métodos que devem ser implementados por uma classe concreta
public interface IClienteDAO { 

    // Método para cadastrar um novo cliente no banco de dados
    // Retorna true se o cadastro for bem-sucedido, false caso contrário
    public Boolean cadastrar(Cliente cliente); 

    // Método para excluir um cliente com base no seu cpf
    // Como retorna void, não há retorno, apenas a exclusão da informação
    public void excluir(Long cpf); 

    // Método para atualizar os dados de um cliente já existente no banco de dados
    public void alterar(Cliente cliente); 

    // Método para buscar um cliente pelo cpf e retornar um objeto Cliente com os dados encontrados
    // Caso o cpf não exista no banco, pode retornar null
    public Cliente consultar(Long cpf); 

    // Método para retornar uma lista contendo todos os clientes cadastrados no banco de dados
    // Utiliza Collection<Cliente>, permitindo flexibilidade no tipo de estrutura usada (List, Set, etc.)
    public Collection<Cliente> buscarTodos(); 
   }
