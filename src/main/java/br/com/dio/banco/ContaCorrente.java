package br.com.dio.banco;

public class ContaCorrente extends Conta {
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfoConta();
    }

    public String getTipoConta() {
        return "Conta Corrente";
    }
}
