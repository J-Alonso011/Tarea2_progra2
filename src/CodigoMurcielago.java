/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author J_Alonso
 */
public class CodigoMurcielago {
    
    private static final String LETRAS = "murcielago";
    private static final String NUMEROS = "0123456789";

    public static String traducir(String texto) {
        texto = texto.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : texto.toCharArray()) {
            int index = LETRAS.indexOf(c);
            if (index != -1) {
                sb.append(NUMEROS.charAt(index));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
