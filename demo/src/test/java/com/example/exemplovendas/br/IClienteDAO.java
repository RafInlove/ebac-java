package com.example.exemplovendas.br;

public interface IClienteDAO {

    Boolean salvarCliente(Cliente cliente);
    
    public Cliente buscarPorCpf(Long cpf);

    void excluirClienteI(Long cpf);

}
