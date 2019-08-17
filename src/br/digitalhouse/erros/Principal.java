package br.digitalhouse.erros;

import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
    try {ArrayList<String> lista = new ArrayList<>();
    lista.add("Joao");
    lista.add("Jessica");
    lista.add("Tarantino");
        System.out.println(lista.get(3));//erro pega o lugar errado
        }catch (java.lang.Exception Ex){
            System.out.println("Ocorreu erro: "+Ex.getMessage());//message mostra onde esta o erro
        Ex.printStackTrace();//ele mostra a pilha de erros



        }

        try {
            Pessoas pessoa = new Pessoas();
            System.out.println(pessoa.getRG() + 0000);//erro frequente, não tem parametro para pegar
        } catch (NullPointerException | IndexOutOfBoundsException | ArithmeticException Ex1) {
            System.out.println("Ocorreu erro de nulidade: " + Ex1.getMessage());//message mostra onde esta o erro
            Ex1.printStackTrace();
        } finally {
            {
                System.out.println("Aconteceu o print dentro do finally");
            }


        }


    }
}
