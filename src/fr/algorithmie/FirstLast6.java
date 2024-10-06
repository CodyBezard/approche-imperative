package fr.algorithmie;

public class FirstLast6 {
    public static void main(String args[]) {
        int[] array = {6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6};

        if (array.length >= 1 && (array[0] == 6 || array[array.length-1] == 6)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
