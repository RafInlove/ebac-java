package com.example.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente); // Cria ou atualiza o cliente
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll(); // Retorna todos os clientes
    }

    public Cliente buscarCliente(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id); // Deleta o cliente pelo ID
    }
}
