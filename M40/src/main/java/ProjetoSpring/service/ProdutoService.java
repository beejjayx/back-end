package ProjetoSpring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ProjetoSpring.domain.Produto;
import ProjetoSpring.repository.IProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private IProdutoRepository repository;

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }
}
