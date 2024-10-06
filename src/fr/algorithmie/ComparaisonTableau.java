package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String args[]) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int elementCommun = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j=0; j< array2.length; j++) {
                if(array[i]==array2[j]){
                    elementCommun ++;
                }
            }
        }
        System.out.println("Il y a " + elementCommun + " élément(s) en commun dans les 2 tableaux");
    }
}
