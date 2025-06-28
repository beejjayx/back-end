package service;

public interface IContratoService {
    String salvar();
    String buscar(int id);
    String excluir(int id);
    String atualizar(int id, String novoValor);
}
