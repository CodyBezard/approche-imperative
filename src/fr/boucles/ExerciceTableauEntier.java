package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String args []) {
        int[] tableauEntier = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(tableauEntier[0]);
        System.out.println(tableauEntier.length);
        System.out.println(tableauEntier[tableauEntier.length-1]);
        tableauEntier[4] = 8;
        System.out.println(tableauEntier[4]);
    }
}
