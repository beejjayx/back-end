package test;


import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDao;
import dao.IContratoDao;
import dao.mock.ContratoDaoMock;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
    IContratoDao dao = new ContratoDaoMock();
    IContratoService service = new ContratoService(dao);
    String retorno = service.buscar(1);
    Assert.assertEquals("Contrato encontrado", retorno);
}

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir(1);
        Assert.assertEquals("Contrato excluído", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar(1, "Novo Valor");
        Assert.assertEquals("Contrato atualizado", retorno);
    }

}