package session1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 1- saisi de la chaine
        System.out.println("Entre ta chaine");
        String chaine = scan.nextLine();

        // 2- Affichage
        System.out.println("La chaine : " + chaine);

        // 3- Affichage de la taille
        System.out.println("Sa taille : " + chaine.length());

        //4- Afficher en minuscule
        System.out.println("Minuscule : " + chaine.toLowerCase());

        //5- Afficher en majuscule
        System.out.println("Majuscule : " + chaine.toUpperCase());

        //6- ordonner la chaine
        char temp = ' ';
        
        char[] chars = new char[chaine.length()];
        for (int i = 0; i < chaine.length(); i++) {
            chars[i] = chaine.charAt(i);
        }
        for (int index = 0; index < chars.length - 1; index++) {
            if (chars[index] > chars[index + 1]) {
                temp = chars[index];
                chars[index] = chars[index + 1];
                chars[index + 1] = temp;

                index = -1;
            }
        }

        String chaineSorted = "";

        for (int index = 0; index < chars.length; index++) {
            chaineSorted = chaineSorted + chars[index];
        }

        System.out.println("Triée : " + chaineSorted);

		//autre façon pour faire le tri
		/*
		char[] chars = chaine.toCharArray();
        Arrays.sort(chars);
        String sortedChaine = String.valueOf(chars);
        System.out.println("Triée : " + sortedChaine);
        */

        //7- Inverse
        String chaineReversed = "";

        for (int i = chaine.length() - 1 ; i >= 0; i--) {
            chaineReversed = chaineReversed + chaine.charAt(i);
        }

        System.out.println("Inverse : " + chaineReversed);

        //autre façon pour faire le reverse
        /*
        String chaineReversed = new StringBuilder(chaine).reverse().toString();
        System.out.println("Inverse : " + chaineReversed);
        */

        //8- palaindrome
        if(chaine.equals(chaineReversed)) {
            System.out.println(true);
        }
    }
}
