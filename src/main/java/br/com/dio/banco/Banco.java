package br.com.dio.banco;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        List<Cliente> clientes = new ArrayList<>();

        for (Conta conta : contas) {
            clientes.add(conta.getCliente());
        }

        return clientes;
    }

    public Conta criarContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente(cliente);
        adicionaContaNaLista(conta);
        return conta;
    }

    public Conta criarContaPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca(cliente);
        adicionaContaNaLista(conta);
        return conta;
    }

    private void adicionaContaNaLista(Conta conta) {
        contas.add(conta);
    }
}
