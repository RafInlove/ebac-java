package com.example.exemplovendas.br;

public interface IClienteService {

    Boolean salvarCliente(Cliente cliente);

    public Cliente buscarPorCpf(Long cpf);

    void excluirClienteI(Long cpf);

}
