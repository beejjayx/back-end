package br.com.benji;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Benji", 26);
        String json = new Gson().toJson(p);
        System.out.println("Objeto convertido para JSON: " + json);
    }
}

class Pessoa {
    String nome;
    int progresso;

    Pessoa(String nome, int progresso) {
        this.nome = nome;
        this.progresso = progresso;
    }
}
