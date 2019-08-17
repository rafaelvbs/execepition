package br.digitalhouse.interfaces;

public class Principal {

    public static void main(String[] args) {

        Cachorro novoCachorro = new Cachorro("Scotish Terrier");
        novoCachorro.animalSaudavel("Saudável");
        novoCachorro.calculoIdadeAnimal(90);
        novoCachorro.setIdade(10);
    }

}
