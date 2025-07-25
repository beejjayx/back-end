package dao;
import dao.generic.jpa.GenericJpaDAO;
import domain.jpa.ProdutoJpa;
import dao.generic.jpa.IProdutoJpaDAO;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
