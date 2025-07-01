
import generic.GenericDAO;
import main.annotation.TipoChave;
import main.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {
	
	public ProdutoDAO() {
		super();
	}

	@Override
	public Class<Produto> getTipoClasse() {
		return Produto.class;
	}

	@Override
	public void atualizarDados(Produto entity, Produto entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setDescricao(entity.getDescricao());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setValor(entity.getValor());
	}

	@Override
	public void atualiarDados(Produto entity, Produto entityCadastrado) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'atualiarDados'");
	}

}
