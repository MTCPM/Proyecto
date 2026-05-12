package ControladorCode;

public class controlador {

    public static void main(String[] args) {

        ejecutarFigura();
        ejecutarSerie();
        serieFor();
        serieDoWhile();
        serieWhile();

        //  Fibonacci con signos
        s2For();
        s2While();
        s2DoWhile();
        // Imprimir cuadrado
        EjecutarCuadrado();
        // Contar letras únicas
        EjecutarContarLetrasUnicas();
        // Iniciales en Matrices
        Ejecutariniciales();
        // Barra Carga 
        EjecutarbarraCarga();
        
        // Suma recursiva
        EjecutarsumaRecu();
        // Automatas 
        Ejecutarautomata();
    }

    public static void ejecutarFigura() {
        matriz.imprimirFigura(10);
    }

    public static void ejecutarSerie() {
        serie.imprimirSerie(10);
    }

    public static void serieFor() {
        serieNum.serieFor(10);
    }

    public static void serieDoWhile() {
        serieNum.serieDoWhile(10);
    }

    public static void serieWhile() {
        serieNum.serieWhile(10);
    }

    // Fibonacci con signos
    public static void s2For() {
        SerieSum.imprimirSerieFor(10);
    }

    public static void s2While() {
        SerieSum.imprimirSerieWhile(10);
    }

    public static void s2DoWhile() {
        SerieSum.imprimirSerieDoWhile(10);
    }
    // Cuadrado

    public static void EjecutarCuadrado() {
        cuadrado.imprimirFigura(10);
    }

    // CAMBIA — > Contar letras únicas
    public static void EjecutarContarLetrasUnicas() {
    ContarLetras.ContarLetrasUnicas("ballena");  // frase definida aquí
    }

    // Iniciales en Matrices
    public static void Ejecutariniciales() {
        iniciales.imprimiIniciales(10, '*');
    }

    // simulacion de barra de carga
    public static void EjecutarbarraCarga() {
        barraCarga.simularCarga('*');
    }

    // Suma recursiva
    public static void EjecutarsumaRecu() {
        sumaRecu.imprimirSuma(5, 3);
    }

    // Automata 
    public static void Ejecutarautomata() {
        automata.probarCadenas();
    }
}