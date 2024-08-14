package com.example.exemplovendas.br;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() {
        Cliente cliente = new Cliente();
        cliente.setCpf(1234567890L);
        cliente.setNomeCliente("Vitória");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11999999999L);

        clienteDao.salvarCliente(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {
        Boolean retorno = clienteDao.salvarCliente(cliente);

        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirClienteI() {
        clienteDao.excluirClienteI(cliente.getCpf());
    }
}
