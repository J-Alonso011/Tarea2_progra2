/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author J_Alonso
 */
public class ArchivoManager {
    
    public static String abrirArchivo(JFrame parent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
        int seleccion = fileChooser.showOpenDialog(parent);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                StringBuilder contenido = new StringBuilder();
                String linea;
                while ((linea = br.readLine()) != null) {
                    contenido.append(linea).append("\n");
                }
                return contenido.toString();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(parent, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }

    public static void guardarArchivo(JFrame parent, String contenido, File archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(contenido);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(parent, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static File guardarComo(JFrame parent, String contenido) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
        int seleccion = fileChooser.showSaveDialog(parent);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            if (!archivo.getName().toLowerCase().endsWith(".txt")) {
                archivo = new File(archivo.getAbsolutePath() + ".txt");
            }
            guardarArchivo(parent, contenido, archivo);
            return archivo;
        }
        return null;
    }
    
}