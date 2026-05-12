package ControladorCode;

public class cuadrado {
    



    public static void imprimirFigura(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    // Fila top y bottom: alterna * y +
                    System.out.print((j % 2 == 0 ? "*" : "+") + " ");
                } else {
                    // Filas intermedias: solo bordes
                    if (j == 0 || j == size - 1) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}

