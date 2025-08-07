package main.java.produto.service;

import produto.model.Produto;
import produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto atualizar(Long id, Produto novo) {
        Produto produto = repository.findById(id).orElseThrow();
        produto.setNome(novo.getNome());
        produto.setPreco(novo.getPreco());
        return repository.save(produto);
    }
}
