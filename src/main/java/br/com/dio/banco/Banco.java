package br.com.dio.banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private final String nome;
    private Set<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        clientes = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void imprimirContasTodosClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("*** " + cliente.getNome() + " ***");
            cliente.imprimirContas();
        }
    }

    public Cliente cadastrarCliente(String nome) {
        Cliente cliente = new Cliente(nome);
        clientes.add(cliente);
        return cliente;
    }

    public Conta criarContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente();
        cliente.adicionarConta(conta);
        return conta;
    }

    public Conta criarContaPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca();
        cliente.adicionarConta(conta);
        return conta;
    }
}
