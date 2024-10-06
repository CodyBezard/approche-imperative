package fr.algorithmie;

public class InversionContenu {
    public static void main(String args[]) {
        int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int [] arrayCopy = new int [array.length];
        // Inversion des données entre array et arrayCopy //
        for (int i=0; i<array.length; i++) {
            arrayCopy[array.length - (i + 1)] = array[i];
        }
        // Affichage de array et arrayCopy pour verification //
        System.out.println("-----Données de array-----");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("---Données de arrayCopy---");
        for (int i=0; i<arrayCopy.length; i++){
            System.out.println(arrayCopy[i]);
        }
    }
}
