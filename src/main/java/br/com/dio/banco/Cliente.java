package br.com.dio.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nome;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void imprimirContas() {
        for (Conta conta : contas) {
            System.out.println(String.format("%s - Agencia: %d   Conta: %d", conta.getTipoConta(), conta.getAgencia(), conta.getNumeroConta()));
        }
    }
}
