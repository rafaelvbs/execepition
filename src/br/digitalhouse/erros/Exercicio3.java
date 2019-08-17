package br.digitalhouse.erros;

public class Exercicio3 {

    public static void main(String[] args) {
        CalculoMatematica calculo = new CalculoMatematica();
        try {
            calculo.divisao(4, 0);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}