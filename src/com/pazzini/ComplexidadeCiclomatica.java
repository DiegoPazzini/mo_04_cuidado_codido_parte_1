package com.pazzini;

public class ComplexidadeCiclomatica {

    // Método que realiza operações condicionais baseadas em paridade
    public static int fazAlgo(int a, int b, int c) {

        // Verifica se 'a' é par, se verdadeiro, retorna a soma de 'b' e 'c'
        if (ePar(a)) return somar(b, c);

        // Verifica se 'b' é par, se verdadeiro, retorna a soma de 'a' e 'c'
        if (ePar(b)) return somar(a, c);

        // Verifica se 'c' é par, se verdadeiro, retorna a soma de 'a' e 'b'
        if (ePar(c)) return somar(a, b);

        // Se nenhum dos números for par, retorna -1
        return -1;
    }

    // Método auxiliar que verifica se um número é par
    private static boolean ePar(int num) {
        return num % 2 == 0;
    }

    // Método auxiliar que realiza a soma de dois números
    private static int somar(int a, int b) {
        return a + b;
    }
}
