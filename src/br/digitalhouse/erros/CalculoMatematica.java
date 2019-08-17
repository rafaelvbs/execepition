package br.digitalhouse.erros;

public class CalculoMatematica {
    public int divisao(int divisor, int num2) {

        int divisao = 0;
        if (divisor == 0) {
            throw new ArithmeticException("Estou lancando um ArithmeticException"); //(usando o contrutor do metodo Aritmetch)
        } else {
            divisao = divisor / num2;
            return divisao;
        }

    }
}
