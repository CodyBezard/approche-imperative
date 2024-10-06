package fr.algorithmie;

import java.util.Scanner;

class TestFibonacci {
    public static int fibonacci (int N){
        int a = 0;
        int b = 1;
        int fibo = 0;
        for (int i=2; i<N; i++){
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }
}
public class InteractifFibonacci {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int resultatFibo = 0;
        System.out.println("Choisissez un nombre :");
        int nombre = scanner.nextInt();
        resultatFibo = TestFibonacci.fibonacci(nombre);
        System.out.println("Le nombre de la suite de Fibonacci au rang " + nombre + " est le " + resultatFibo);
    }

}

