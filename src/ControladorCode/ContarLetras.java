package ControladorCode;

public class ContarLetras {

    public static void ContarLetrasUnicas(String frase) {
        frase = frase.toLowerCase();
        String unicas = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c) && unicas.indexOf(c) == -1) {
                unicas += c;
            }
        }
        System.out.println("La frase '" + frase + "' tiene " + unicas.length() + " letras unicas");
    }
}