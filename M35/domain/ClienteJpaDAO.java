package domain;
import dao.generic.jpa.GenericJpaDAO;
import domain.jpa.ClienteJpa;
import dao.IClienteJpaDAO;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
