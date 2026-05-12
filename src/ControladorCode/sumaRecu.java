package ControladorCode;

public class sumaRecu {

    public static int suma(int a, int b) {
        // Caso base
        if (b == 0) return a;
        // Caso recursivo: suma 1 a 'a' y resta 1 a 'b'
        return suma(a + 1, b - 1);
    }

    public static void imprimirSuma(int a, int b) {
        System.out.println("suma(" + a + ", " + b + ") = " + suma(a, b));
    }
}
