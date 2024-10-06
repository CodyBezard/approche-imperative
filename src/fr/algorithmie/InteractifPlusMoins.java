package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        int nb = 0;
        int coups = 0;
        System.out.println(random);
        System.out.println("Un nombre aléatoire entre 1 et 100 a été choisi par mes soins.");
        System.out.println("Essaye de le deviner avec le moins de coup possible.");
        while(nb != random) {
            nb = scanner.nextInt();
            coups ++;
            if (nb > random){
                System.out.println("Raté, le nombre est plus petit.");
            } else if (nb < random) {
                System.out.println("Raté, le nombre est plus grand.");
            }
        }
        System.out.println("Bravo ! Vous avez touvé en " + coups + " coups.");

        }
    }

