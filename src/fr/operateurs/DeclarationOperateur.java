package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String args []) {
        int a = 10;
        int b = 20;
        // Test opérateur ET //
        boolean testEt = (a>0) && (b<10);
        System.out.println(testEt);
        // Test opérateur OU //
        boolean testOu = a>0 || b<10;
        System.out.println(testOu);
        // Incrémentation //
        a=a+1;
        System.out.println(a);
        a++;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        // Test opérateur ternaire //
        String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";
        System.out.println(c);
    }
}
