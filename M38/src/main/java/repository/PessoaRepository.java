import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import br.com.benji.cadastro.model.Pessoa;


public class PessoaRepository {
    @PersistenceContext
    private EntityManager em;

    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }
}
