package ControladorCode;

public class SerieSum {

    public static void imprimirSerieFor(int n) {
        System.out.println("--- Serie S2 (for) ---");
        for (int i = 1; i <= n; i++) {
            System.out.println("S2(" + i + ") = " + s2(i));
        }
    }

    public static void imprimirSerieWhile(int n) {
        System.out.println("--- Serie S2 (while) ---");
        int i = 1;
        while (i <= n) {
            System.out.println("S2(" + i + ") = " + s2(i));
            i++;
        }
    }

    public static void imprimirSerieDoWhile(int n) {
        System.out.println("--- Serie S2 (do-while) ---");
        int i = 1;
        do {
            System.out.println("S2(" + i + ") = " + s2(i));
            i++;
        } while (i <= n);
    }

    public static String s2(int n) {
        if (n <= 2) return "+";
        int a = 1, b = 1;
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return "+".repeat(b);
    }
}

