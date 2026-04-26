package ControladorCode;

import java.util.Scanner;


public class matriz {

    public static void imprimirFigura(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                if (
                    j == 0 ||
                    j == 2 * n - 2 ||
                    i == j ||
                    i + j == 2 * n - 2
                ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}