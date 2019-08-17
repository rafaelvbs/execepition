package br.digitalhouse.TarefaErros;

import java.util.ArrayList;

public class exercicio2 {
    public static void main(String[] args) {

        try {
            ArrayList<String> animais = new ArrayList<>();
            animais.add("Gato");
            animais.add("Pato");
            animais.add("Cao");

            System.out.println(animais.get(5));
        } catch (NullPointerException erro) {
            System.out.println("Ocorreu erro : " + erro.getMessage());
            erro.printStackTrace();
        } catch (IndexOutOfBoundsException erro1) {
            System.out.println("Ocorreu erro : " + erro1.getMessage());
            erro1.printStackTrace();
        }
    }
}
