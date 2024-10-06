package fr.algorithmie;

public class AffichageInverse {
    public static void main(String args[]) {
        int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        System.out.println("------Ensemble des éléments----------");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("------Ensemble des éléments inverse----------");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[array.length - (i + 1)]);
        }
        // Copie des éléments de array vers arrayCopy //
        int [] arrayCopy = new int [array.length];
        for (int i=0; i<array.length; i++){
            arrayCopy [i] = array[i];
        }
        System.out.println("------Contenu de arrayCopy----------");
        // Contenu de arrayCopy pour verifier la copie //
        for (int i=0; i<arrayCopy.length; i++){
            System.out.println(arrayCopy[i]);
        }
    }
}
