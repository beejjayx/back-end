package projetomono.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UsuarioRepository {
    @PersistenceContext
    private EntityManager em;

    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }
}
