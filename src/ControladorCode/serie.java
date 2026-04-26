
package ControladorCode;
import java.util.Scanner;



public class serie {

    public static void imprimirSerie(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("+");
            }
        }
    }
}