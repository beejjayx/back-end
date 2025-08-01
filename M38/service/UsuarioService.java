package com.seuprojeto.service;

import com.seuprojeto.model.Usuario;
import com.seuprojeto.repository.UsuarioRepository;

public class UsuarioService {
    private UsuarioRepository repository = new UsuarioRepository();

    public void cadastrar(Usuario usuario) {
        if (usuario.getEmail().contains("@")) {
            repository.salvar(usuario);
        } else {
            throw new RuntimeException("Email inválido");
        }
    }
}
