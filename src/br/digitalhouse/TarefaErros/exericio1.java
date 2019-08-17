package br.digitalhouse.TarefaErros;
import java.util.ArrayList;
public class exericio1 {
    public static void main(String[] args) {

   try{ ArrayList<String> animais = new ArrayList<>();
    animais.add("Gato");
    animais.add("Pato");
    animais.add("Cao");

        System.out.println(animais.get(3));
   }catch (java.lang.Exception erro){
       System.out.println("Ocorreu erro : " + erro.getMessage());
       erro.printStackTrace();

   }

}
}
