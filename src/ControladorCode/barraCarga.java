package ControladorCode;


    

public class barraCarga {

    public static void simularCarga(char caracter) {
        int longitud = 20;

        for (int progreso = 0; progreso <= longitud; progreso++) {
            int porcentaje = progreso * 100 / longitud;

            System.out.print("[");
            for (int i = 0; i < longitud; i++) {
                if (i < progreso) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");

            // Vuelve al inicio de la línea para sobreescribir
            System.out.print("\r");

            try {
                Thread.sleep(200); // pausa de 200ms entre cada paso
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // salto de línea al terminar
    }
}

