package ControladorCode;

public class iniciales {

    public static void imprimiIniciales(int size, char caracter) {
        // Imprime M y C en la misma fila
        for (int i = 0; i < size; i++) {
            filaM(i, size, caracter);
            System.out.print("   ");  // espacio entre letras
            filaC(i, size, caracter);
            System.out.println();
        }
    }

    // NUEVO — imprime una fila de la M
    private static void filaM(int i, int size, char caracter) {
        for (int j = 0; j < size; j++) {
            if (j == 0 || j == size - 1) {
                System.out.print(caracter);
            } else if (i == j && i < size / 2) {
                System.out.print(caracter);
            } else if (i == size - 1 - j && i < size / 2) {
                System.out.print(caracter);
            } else {
                System.out.print(" ");
            }
        }
    }

    // NUEVO — imprime una fila de la C
    private static void filaC(int i, int size, char caracter) {
        for (int j = 0; j < size; j++) {
            if (i == 0 || i == size - 1) {
                if (j < size - 1) System.out.print(caracter);
                else System.out.print(" ");
            } else if (j == 0) {
                System.out.print(caracter);
            } else {
                System.out.print(" ");
            }
        }
    }
}
