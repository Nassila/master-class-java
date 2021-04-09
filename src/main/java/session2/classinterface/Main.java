package session2.classinterface;

public class Main {

    public static void main(String[] args) {
        Chat chat = new Chat("Chat");
        Lion lion = new Lion("Lion");

        System.out.println("je suis un " + chat.getNom());
        chat.manger();
        chat.crier();

        System.out.println("je suis un " + lion.getNom());
        lion.manger();
        lion.crier();
    }
}
