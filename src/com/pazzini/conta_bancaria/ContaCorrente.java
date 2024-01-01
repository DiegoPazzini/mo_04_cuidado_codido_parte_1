package com.pazzini.conta_bancaria;

public class ContaCorrente extends ContaBancaria {

    private int limite;

    // Construtor que inicializa o saldo e o limite da conta corrente
    public ContaCorrente(int saldo, int limite) {
        // Chama o construtor da classe pai (ContaBancaria) para inicializar o saldo
        super(saldo);
        this.limite = limite;
    }

    // Implementação do método abstrato da classe pai
    public boolean temSaldoParaDebitar(int saldoDebitar) {
        // Verifica se o saldo mais o limite é suficiente para o débito desejado
        if (saldo + limite >= saldoDebitar) {
            return true;
        }
        return false;
    }
}
