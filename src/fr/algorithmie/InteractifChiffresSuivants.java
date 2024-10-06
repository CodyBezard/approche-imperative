package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecris-moi un nombre, je t'afficherais les 10 nombres suivants");
        int nb = scanner.nextInt();
        System.out.println("Et voici les 10 nombres suivants de " + nb);
        for (int i = 1; i < 11; i++) {
            System.out.print(nb + i + " ");
        }
    }
}
