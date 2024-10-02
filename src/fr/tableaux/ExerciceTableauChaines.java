package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String args []) {
        String [] tableauChaine = {"Lyon","Toulouse","Paris","Montpellier","Marseille"};
        for (int i=0; i < 5; i++) {
            System.out.println(tableauChaine[i]);
        }
        System.out.println(tableauChaine.length);
        tableauChaine[3] = "Reims";
        for (int i=0; i < 5; i++) {
            System.out.println(tableauChaine[i]);
        }
    }
}
