package fr.algorithmie;

public class AffichageSuite {
    public static void main(String args[]) {
        String liste1a10f = "";
        int n = 1;
        String oddNumbersF = "";
        String evenNumbersF = "";
        System.out.println("-------Exercice Boucle For-------");
        // Affichage de tous les nombres de 1 à 10 boucle for //
        for (int i=0; i<10; i++){
            liste1a10f = liste1a10f +" "+ n;
            n++;
        }
        System.out.println("Nombre de 1 à 10 boucle for :" + liste1a10f);

        // Affichage nombre pairs et impairs entre 0 et 10 boucle for //
        for (int i=0; i<10; i++){
            if (((i+1)%2) ==0){
                evenNumbersF = evenNumbersF + " " + (i+1);
            }
            else {
                oddNumbersF = oddNumbersF + " " + (i+1);
            }
        }
        System.out.println("Nombre pairs entre 0 et 10 boucle for :" + evenNumbersF);
        System.out.println("Nombre impairs entre 0 et 10 boucle for :" + oddNumbersF);

        String liste1a10w = "";
        int j=0;
        int h=0;
        String oddNumbersW = "";
        String evenNumbersW = "";
        System.out.println("------Exercice Boucle While------");
        // Affichage de tous les nombres de 1 à 10 boucle while //
        while (j<10){
            liste1a10w = liste1a10w +" "+ (j+1);
            j++;
        }
        System.out.println("Nombre de 1 à 10 boucle while :" + liste1a10w);

        // Affichage nombre pairs et impairs entre 0 et 10 boucle while //
        while (h<10){
            if (((h+1)%2) ==0){
                evenNumbersW = evenNumbersW + " " + (h+1);
            }
            else {
                oddNumbersW = oddNumbersW + " " + (h+1);
            }
            h++;
        }
        System.out.println("Nombre pairs entre 0 et 10 boucle while :" + evenNumbersW);
        System.out.println("Nombre pairs entre 0 et 10 boucle while :" + oddNumbersW);
    }
}