package test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.dao.VendaDAOTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
