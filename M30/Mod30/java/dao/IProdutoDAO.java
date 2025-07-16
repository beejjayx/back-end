import java.util.List;
import domain.Produto;
public interface IProdutoDAO {

    Produto buscar(String codigo) throws Exception;

    List<Produto> buscarTodos() throws Exception;

    Integer excluir(Produto produto) throws Exception;
    
    Integer cadastrar(Produto produto) throws Exception;
}
