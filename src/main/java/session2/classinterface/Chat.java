package session2.classinterface;

public class Chat extends Animal implements CriAnimal{

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println("je mange des croquettes");
    }

    @Override
    public void crier() {
        System.out.println("je miaule");
    }
}
