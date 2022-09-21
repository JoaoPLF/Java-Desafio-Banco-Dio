package br.com.dio.banco;

public class ContaPoupanca extends Conta {
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupanca ***");
        super.imprimirInfoConta();
    }

    public String getTipoConta() {
        return "Conta Poupanca";
    }
}
