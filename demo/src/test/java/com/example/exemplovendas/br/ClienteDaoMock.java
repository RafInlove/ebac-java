package com.example.exemplovendas.br;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public Boolean salvarCliente(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluirClienteI(Long cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluirClienteI'");
    }
}
