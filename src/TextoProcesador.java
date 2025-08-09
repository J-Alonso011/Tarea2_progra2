/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author J_Alonso
 */
public class TextoProcesador {
    
    public static int contarCaracteres(String texto) {
        return texto.length();
    }

    public static int contarPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    public static String primeraLetra(String texto) {
        return texto.isEmpty() ? "" : String.valueOf(texto.charAt(0));
    }

    public static String ultimaLetra(String texto) {
        return texto.isEmpty() ? "" : String.valueOf(texto.charAt(texto.length() - 1));
    }

    public static String letraCentral(String texto) {
        if (texto.isEmpty()) return "";
        return String.valueOf(texto.charAt(texto.length() / 2));
    }

    public static String primeraPalabra(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length > 0 ? palabras[0] : "";
    }

    public static String ultimaPalabra(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length > 0 ? palabras[palabras.length - 1] : "";
    }

    public static String palabraCentral(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length > 0 ? palabras[palabras.length / 2] : "";
    }

    
    public static int contarPalabrasPares(String texto) {
        int contador = 0;
        String[] palabras = texto.trim().split("\\s+");
        for (String palabra : palabras) {
            if (palabra.length() % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPalabrasImpares(String texto) {
        int contador = 0;
        String[] palabras = texto.trim().split("\\s+");
        for (String palabra : palabras) {
            if (palabra.length() % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }
    
    public static int contarOcurrenciasChar(String texto, char c) {
        if (texto == null) return 0;
        int cnt = 0;
        char objetivo = Character.toLowerCase(c);
        for (char ch : texto.toLowerCase().toCharArray()) {
            if (ch == objetivo) cnt++;
        }
        return cnt;
    }
    
}
