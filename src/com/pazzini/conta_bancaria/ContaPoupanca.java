package com.pazzini.conta_bancaria;

public class ContaPoupanca extends ContaBancaria {

    // Construtor que inicializa o saldo da conta poupança
    public ContaPoupanca(int saldo) {
        // Chama o construtor da classe pai (ContaBancaria) para inicializar o saldo
        super(saldo);
    }

    // Implementação do método abstrato da classe pai
    public boolean temSaldoParaDebitar(int saldoDebitar) {
        // Verifica se o saldo é suficiente para o débito desejado
        if (saldo >= saldoDebitar) {
            return true;
        }
        return false;
    }
}
