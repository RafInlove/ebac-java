package com.example.exemplovendas.br;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;



public class ClienteTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
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

        clienteService.salvarCliente(cliente);
    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvarCliente(cliente);

        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirClienteI() {
        clienteService.excluirClienteI(cliente.getCpf());
    }
}
