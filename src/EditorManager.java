/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.TextArea;
import javax.swing.*;
/**
 *
 * @author J_Alonso
 */
public class EditorManager {
    public static void copiar(JTextArea area) {
        area.copy();
    }

    public static void cortar(JTextArea area) {
        area.cut();
    }

    public static void pegar(JTextArea area) {
        area.paste();
    }

    public static int buscar(JTextArea area, String palabra) {
        String texto = area.getText();
        int index = texto.indexOf(palabra);
        if (index != -1) {
            area.select(index, index + palabra.length());
        }
        return index;
    }

    public static void reemplazar(JTextArea area, String buscar, String reemplazar) {
        String texto = area.getText();
        texto = texto.replace(buscar, reemplazar);
        area.setText(texto);
    }

    static void copiar(TextArea txt_palabras) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    static int buscar(TextArea txt_palabras, String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    static void cortar(TextArea txt_palabras, String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
