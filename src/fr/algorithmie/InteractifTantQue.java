package fr.algorithmie;
// Ceci importe la classe Scanner du package java.util //
import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Joue avec moi ...");
        System.out.println("Donne-moi un nombre compris entre 1 et 10 :");
        int nb = scanner.nextInt();
        while(nb > 10 || nb < 1){
            System.out.println("J'ai dit compris entre 1 et 10 :");
            nb = scanner.nextInt();
        }
        System.out.println("Merci d'avoir jouer");
    }
}
