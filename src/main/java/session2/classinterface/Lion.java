package session2.classinterface;

public class Lion extends Animal implements CriAnimal {
    public Lion(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println("je mange de la viande");
    }

    @Override
    public void crier() {
        System.out.println("je rugis");
    }
}
