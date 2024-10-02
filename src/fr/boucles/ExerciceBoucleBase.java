package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String args []) {
        String liste1a10 = "";
        String prenomNom = "Cody Bezard";
        String oddNumbers = "";
        String evenNumbers = "";
        int n = 1;

        for (int i=0; i<10; i++){
            liste1a10 = liste1a10 +" "+ n;
            n++;
        }
        System.out.println(liste1a10);
        for (int i=0; i<20; i++){
            System.out.println(prenomNom);
        }
        for (int i=0; i<100; i++){
            if (((i+1)%2) ==0){
                evenNumbers = evenNumbers + " " + (i+1);
            }
            else {
                oddNumbers = oddNumbers + " " + (i+1);
            }
        }
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }
}
