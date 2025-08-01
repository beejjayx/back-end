import model.Pessoa;
import repository.PessoaRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


public class PessoaService {
    @Inject
    private PessoaRepository pessoaRepository;

    public void validarESalvar(Pessoa pessoa) {
        if (pessoa.getNome() == null || pessoa.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }
        pessoaRepository.salvar(pessoa);
    }
}
