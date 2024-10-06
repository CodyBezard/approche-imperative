package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecris-moi un nombres, je t'afficherais la somme de tous les entiers compris entre 1 et ce nombre :");
        int nb = scanner.nextInt();
        int sum = nb;
        for(int i=1;i<nb;i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
