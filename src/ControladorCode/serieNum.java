// Primer ejercicio

package ControladorCode;

import java.util.Scanner;

public class serieNum {

    // Serie con FOR
    public static void serieFor(int n) {
        int a = 1;
        int j = 0;

        System.out.println("La serie con FOR es:");

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(j + " ");
            } else {
                System.out.print(a + " ");
                a = a + 2;
            }
        }

        System.out.println();
    }

    // Serie con DO-WHILE
    public static void serieDoWhile(int n) {
        int a = 1;
        int i = 0;
        int j = 0;

        System.out.println("La serie con DO-WHILE es:");

        do {
            i++;

            if (i % 2 != 0) {
                System.out.print(a + " ");
                a = a + 2;
            } else {
                System.out.print(j + " ");
            }

        } while (i < n);

        System.out.println();
    }

    // Serie con WHILE
    public static void serieWhile(int n) {
        int a = 1;
        int i = 0;
        int j = 0;

        System.out.println("La serie con WHILE es:");

        while (i < n) {
            i++;

            if (i % 2 != 0) {
                System.out.print(a + " ");
                a = a + 2;
            } else {
                System.out.print(j + " ");
            }
        }

        System.out.println();
    }

    // Método principal opcional
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos: ");
        int n = scanner.nextInt();

        serieFor(n);
        serieDoWhile(n);
        serieWhile(n);

        scanner.close();
    }
}


    

