package br.com.dio.banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");
        Cliente cliente1 = banco.cadastrarCliente("Joao");
        Conta corrente = banco.criarContaCorrente(cliente1);
        Conta poupanca = banco.criarContaPoupanca(cliente1);

        corrente.depositar(50);
        corrente.transferir(20, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.imprimirContasTodosClientes();
    }
}