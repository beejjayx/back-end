package javaapplication1.domain;


public class Cliente {  
    // Declaração da classe Cliente  
    // Essa classe representa um cliente, armazenando seus dados pessoais e de localização  

    // Atributos privados para proteger os dados do cliente e manter o princípio de encapsulamento  
    private String nome;  
    private Long cpf;  
    private Long tel;  
    private String end;  
    private Integer numero;  
    private String cidade;  
    private String estado;  

    // Construtor da classe Cliente  
    // Esse método é chamado ao criar um novo objeto Cliente, inicializando seus atributos  
    public Cliente(String nome, String Cpf, String tel, String end, String num, String cidade, String estado) {  
        this.nome = nome;  
        this.cpf = Long.valueOf(Cpf);
        this.tel = Long.valueOf(tel);
        this.end = end;
        this.numero = Integer.valueOf(num);
        this.cidade = cidade;
        this.estado = estado;  
    }



    //GETTERS AND SETTERS
    // Métodos para acessar e modificar os atributos privados da classe
    // Isso permite seguir o princípio do encapsulamento e proteger os dados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }




     //EQUALS AND HASHCODE
    // Métodos que garantem que objetos iguais sejam tratados como iguais
    // Necessários para coleções como HashSet e HashMap
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    // Verifica se dois objetos Cliente são iguais comparando seus cpfs
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }



    //TO STRING
    // Método usado para representar um objeto Cliente como uma String
    // Útil para depuração e exibição dos dados
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
    }   
}