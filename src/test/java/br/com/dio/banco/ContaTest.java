package br.com.dio.banco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ContaTest {
    static Banco banco;
    static Cliente cliente;
    static Conta corrente;
    static Conta poupanca;
    final double VALOR_DEPOSITO = 50;
    final double VALOR_SAQUE = 30;

    @BeforeAll
    static void inicializaVariaveis() {
        banco = new Banco("Banco Digital");
        cliente = banco.cadastrarCliente("Joao");
        corrente = banco.criarContaCorrente(cliente);
        poupanca = banco.criarContaPoupanca(cliente);
    }

    @Test
    void validaDeposito() {
        corrente.depositar(50);
        Assertions.assertEquals(VALOR_DEPOSITO, corrente.getSaldo());
    }

    @Test
    void validaSaque() {
        corrente.sacar(30);
        Assertions.assertEquals((VALOR_DEPOSITO - VALOR_SAQUE), corrente.getSaldo());
    }

    @Test
    void validaTransferencia() {
        corrente.transferir(20, poupanca);
        Assertions.assertEquals(0, corrente.getSaldo());
        Assertions.assertEquals(20, poupanca.getSaldo());
    }
}
