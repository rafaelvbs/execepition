package br.digitalhouse.interfaces;

public class Cachorro extends Animal implements Saudavel, Brincavel{



    public Cachorro (String novaRaca){
        super(novaRaca);

    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        System.out.println("Status diagnostico da raça " + getRaca() + " é " + diagnostico);
        return false;
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Somando idades!!!");
        return getIdade() + novaIdade;

    }

    @Override
    public void seDivertir() {

    }
}
