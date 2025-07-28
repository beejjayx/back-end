package dao.jpa;

import dao.generic.jpa.IGenericJapDAO;
import domain.jpa.Persistente;
terface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
