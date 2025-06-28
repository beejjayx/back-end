package dao;

public interface IContratoDao {
    void salvar();
    void buscar(int id);
    void excluir(int id);
    void atualizar(int id, String novoValor);
}
