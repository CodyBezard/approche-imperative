package fr.algorithmie;

public class Rotation {
    public static void main(String args[]) {
        int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int a = array[0];
        int b = 0;

        for (int i = 0; i < array.length-1; i++) {
            b = array[i+1];
            array[i+1] = a;
            a = b;
        }
        array[0] = b;
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
