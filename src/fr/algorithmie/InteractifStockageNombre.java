package fr.algorithmie;

import java.util.Scanner;

class ArrayPlusGrand{
    //Methode d'aggrandissement de tableau d'une case avec ajout de nouveau nombre//
    public static int[] addX(int tableau[],int x){
        int newTableau[] = new int[tableau.length + 1];
        for (int i=0; i<tableau.length; i++){
            newTableau[i]=tableau[i];
        }
        newTableau[tableau.length] = x;
        return newTableau;
    }
}
public class InteractifStockageNombre {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = {2,5,89,7,3};
        System.out.println("1.Ajouter un nombre");
        System.out.println("2. Afficher les nombres existants");
        int menuNb = scanner.nextInt();
        if(menuNb == 1){
            System.out.println("Quel nombre voulez-vous ajouter à la liste?");
            int newNb = scanner.nextInt();
            tableau = ArrayPlusGrand.addX(tableau,newNb);
            System.out.print("Le tableau contient maintenant les valeurs suivantes :");
            for(int i =0; i<tableau.length;i++) {
                System.out.print(tableau[i] + " ");
            }
        } else if (menuNb == 2) {
            System.out.println("Voici le contenu de la liste");
            for(int i =0; i<tableau.length;i++){
                System.out.print(tableau[i] + " ");
            }

        }
    }
}
