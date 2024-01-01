package com.pazzini.conta_bancaria;

// Para melhorar a complexidade, vamos transforma ContaBancaria em uma classe abstrata
public abstract class ContaBancaria {

    protected int saldo;

    // Construtor que inicializa o saldo da conta
    public ContaBancaria(int saldo) {
        this.saldo = saldo;
    }

    // Cria um método abstrato que as subclasses devem implementar
    public abstract boolean temSaldoParaDebitar(int saldoDebitar);
}
