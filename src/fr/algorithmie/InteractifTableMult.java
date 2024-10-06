package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Place aux tables de multiplications");
        System.out.println("Donne-moi un nombre compris entre 1 et 10 et tu auras sa table :");
        int nb = scanner.nextInt();
        while(nb > 10 || nb < 1){
            System.out.println("J'ai dit compris entre 1 et 10 :");
            nb = scanner.nextInt();
        }
        System.out.println("Voici la table de multiplication du nombre " + nb);
        for (int i = 1; i< 11; i++){
            System.out.println(nb + " x " + i + " = " + nb*i);
        }

    }
}
