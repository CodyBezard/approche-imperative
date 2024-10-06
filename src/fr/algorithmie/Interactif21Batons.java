package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
        public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Definition au préalable qui commencera la partie. True => humain, False => Ordi //
        double ordre = (Math.random()+0.5);
        int nbBaton = 21;
        int nombreBatonOrdi=0;
        int nombreBatonJoueur=0;
        int methodeChoisi=0;
        int[] nombreGagnant = {21,17,13,9,5,1};
        // Entête et choix de difficulté //
        System.out.println(":*---Bienvenue dans le jeu des 21 bouts de bois durs---*:");
        System.out.println(".Quel niveau de difficulté voulez-vous affronter ?");

        // Niveau 1, l'ordi choisi au hasard de 1 à 3 batons //
        System.out.println("1. GneuGneu");

        // Niveau 2, l'ordi fait toujours en sorte que 4 batons soient pris par tour //
        System.out.println("2. Normal");

        int menuNb = scanner.nextInt();
        while (menuNb != 1 && menuNb != 2) {
            System.out.println("La consigne était simple... 1 OU 2!");
            menuNb = scanner.nextInt();
        }
        switch (menuNb) {
            case 1:
                while (nbBaton > 0) {
                    if (ordre > 1) {
                        System.out.println("A votre tour de jouer. Choisissez entre 1 et 3 batons:");
                        int choixBaton = scanner.nextInt();
                        nbBaton = nbBaton - choixBaton;
                        if (nbBaton > 0) {
                            System.out.println("Il reste " + nbBaton + " en jeu. C'est au tour de votre adversaire.");
                            ordre = ordre - 0.5;
                        } else {
                            System.out.println("Dommage... Vous avez perdu...");
                        }
                    }
                    if (ordre <= 1){
                        System.out.println("Au tour de votre adversaire :");
                        double random = Math.random();
                        if (random<=0.33){
                            nombreBatonOrdi = 1;
                        } else if (random > 0.33 && random <0.66) {
                            nombreBatonOrdi = 2;
                        }else {
                            nombreBatonOrdi = 3;
                        }
                        nbBaton = nbBaton - nombreBatonOrdi;
                        if (nbBaton > 0) {
                            System.out.println("Il reste " + nbBaton + " en jeu. C'est à votre tour.");
                            ordre = ordre + 0.5;
                        } else {
                            System.out.println("Bravo ! Vous avez battu l'ordinateur !");
                        }

                    }
                }
            case 2:
                while (nbBaton > 0){
                    if (ordre > 1) {
                        System.out.println("A votre tour de jouer. Choisissez entre 1 et 3 batons:");
                        int choixBaton = scanner.nextInt();
                        nbBaton = nbBaton - choixBaton;
                        nombreBatonJoueur = choixBaton;
                        if (nbBaton > 0) {
                            System.out.println("Il reste " + nbBaton + " en jeu. C'est au tour de votre adversaire.");
                            ordre = ordre - 0.5;
                        } else {
                            System.out.println("Dommage... Vous avez perdu...");
                        }
                    }
                    if (ordre <= 1){
                        System.out.println("Au tour de votre adversaire :");
                        for (int i = 0;i < nombreGagnant.length-1;i++){
                            if (nbBaton == nombreGagnant[i]){
                                methodeChoisi = 1;
                            }else {
                                methodeChoisi = 2;
                            }
                        }
                        // Le nombre de baton ne fait pas parti de la liste, donc l'ordi choisi aléatoirement le nombre de baton qu'il prend //
                        if (methodeChoisi == 1) {
                            double random = Math.random();
                            if (random <= 0.33) {
                                nombreBatonOrdi = 1;
                            } else if (random > 0.33 && random < 0.66) {
                                nombreBatonOrdi = 2;
                            } else {
                                nombreBatonOrdi = 3;
                            }
                        }

                        // Le nombre de baton est dans la liste, donc l'ordi fait en sorte que le nombre de baton retiré dans le tour joueur+ordi soit de 4 //
                        if (methodeChoisi == 2){
                            nombreBatonOrdi = 4 - nombreBatonJoueur;
                        }
                        nbBaton = nbBaton - nombreBatonOrdi;
                        if (nbBaton > 0) {
                            System.out.println("Il reste " + nbBaton + " en jeu. C'est à votre tour.");
                            ordre = ordre + 0.5;
                        } else {
                            System.out.println("Bravo ! Vous avez battu l'ordinateur !");
                        }

                    }
                }
        }

    }
}
