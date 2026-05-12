package ControladorCode;


    
public class automata {

    public static boolean validar(String cadena) {
        int estado = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            
            switch (estado) {
                case 0: // espera 'a'
                    if (c == 'a') estado = 1;
                    else return false;
                    break;

                case 1: // espera al menos una 'b'
                    if (c == 'b') estado = 2;
                    else return false;
                    break;

                case 2: // acepta más 'b' o espera 'c'
                    if (c == 'b') estado = 2;
                    else if (c == 'c') estado = 3;
                    else return false;
                    break;

                case 3: // espera 'a' final
                    if (c == 'a') estado = 4;
                    else return false;
                    break;

                case 4: // estado final, no debe haber más caracteres
                    return false;
            }
        }
        return estado == 4; // solo válido si terminó en estado 4
    }

    public static void probarCadenas() {
        String[] pruebas = {"abca", "abbca", "abbbca", "aca", "abba", "bca", "abcaa", ""};
        
        for (String cadena : pruebas) {
            String resultado = validar(cadena) ? "VALIDA" : "INVALIDA";
            System.out.println("'" + cadena + "' => " + resultado);
        }
    }
}

