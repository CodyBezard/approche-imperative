package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int plusGrand = 0;
        System.out.println("Ecris-moi 10 nombres, je t'afficherais le plus grand :");
        for(int i=0;i<10;i++) {
            int nb = scanner.nextInt();
            if(nb>plusGrand){
                plusGrand = nb;
            }
        }
        System.out.println("Le plus grand nombres est le "+ plusGrand);
    }
}