package br.com.dio.banco;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA_NUMERO_CONTA = 1;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public abstract void imprimirExtrato();
    public abstract String getTipoConta();

    public Conta() {
        agencia = AGENCIA_PADRAO;
        numeroConta = SEQUENCIA_NUMERO_CONTA++;
        saldo = 0d;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirInfoConta() {
        System.out.println("Agencia: " + agencia + "    Conta: " + numeroConta);
        System.out.println(String.format("Saldo: R$ %.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
