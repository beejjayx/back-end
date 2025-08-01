package controller;
import model.Pessoa;
import service.PessoaService;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class PessoaController {
    private Pessoa pessoa = new Pessoa();

    @Inject
    private PessoaService pessoaService;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String salvar() {
        pessoaService.validarESalvar(pessoa);
        return "sucesso.xhtml";
    }
}
