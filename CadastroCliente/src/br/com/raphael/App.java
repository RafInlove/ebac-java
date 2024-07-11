package br.com.raphael;

import br.com.raphael.dao.ClienteMapDAO;
import br.com.raphael.dao.IClienteDAO;
import br.com.raphael.domain.Cliente;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        IClienteDAO clienteDAO = new ClienteMapDAO();

        while (true) {
            String opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar e 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);

            if (opcao == null || opcao.equals("5")) {
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            }

            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String cpf = JOptionPane.showInputDialog("CPF:");
                    String tel = JOptionPane.showInputDialog("Telefone:");
                    String end = JOptionPane.showInputDialog("Endereço:");
                    String numero = JOptionPane.showInputDialog("Número:");
                    String cidade = JOptionPane.showInputDialog("Cidade:");
                    String estado = JOptionPane.showInputDialog("Estado:");

                    Cliente cliente = new Cliente(nome, cpf, tel, end, numero, cidade, estado);
                    if (clienteDAO.cadastrar(cliente)) {
                        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente já cadastrado!");
                    }
                    break;

                case "2":
                    cpf = JOptionPane.showInputDialog("CPF do cliente a consultar:");
                    Cliente clienteConsultado = clienteDAO.consultar(Long.valueOf(cpf.trim()));
                    if (clienteConsultado != null) {
                        JOptionPane.showMessageDialog(null, clienteConsultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;

                case "3":
                    cpf = JOptionPane.showInputDialog("CPF do cliente a excluir:");
                    clienteDAO.excluir(Long.valueOf(cpf.trim()));
                    JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                    break;

                case "4":
                    cpf = JOptionPane.showInputDialog("CPF do cliente a alterar:");
                    clienteConsultado = clienteDAO.consultar(Long.valueOf(cpf.trim()));
                    if (clienteConsultado != null) {
                        nome = JOptionPane.showInputDialog("Nome:", clienteConsultado.getNome());
                        tel = JOptionPane.showInputDialog("Telefone:", clienteConsultado.getTel().toString());
                        end = JOptionPane.showInputDialog("Endereço:", clienteConsultado.getEnd());
                        numero = JOptionPane.showInputDialog("Número:", clienteConsultado.getNumero().toString());
                        cidade = JOptionPane.showInputDialog("Cidade:", clienteConsultado.getCidade());
                        estado = JOptionPane.showInputDialog("Estado:", clienteConsultado.getEstado());

                        Cliente clienteAlterado = new Cliente(nome, cpf, tel, end, numero, cidade, estado);
                        clienteDAO.alterar(clienteAlterado);
                        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
