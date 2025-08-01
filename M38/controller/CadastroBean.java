package com.seuprojeto.controller;

import com.seuprojeto.model.Usuario;
import com.seuprojeto.service.UsuarioService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroBean {
    private Usuario usuario = new Usuario();
    private UsuarioService service = new UsuarioService();

    public void salvar() {
        service.cadastrar(usuario);
    }

    // getters e setters
}
