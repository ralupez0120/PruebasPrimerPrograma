/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class GestionDatos extends JFrame{
    private JFrame mainFrame;
    
    public String abrirArchivo(){
        String fileName = "";
        JFileChooser  fileDialog = new JFileChooser();
        int returnVal = fileDialog.showOpenDialog(mainFrame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
               fileName = fileDialog.getSelectedFile().getAbsolutePath();
        } else { 
           fileName = "";
        }
        return fileName;
    }
    
    public ListaLigada leerDatos(String delimiter) throws FileNotFoundException, IOException{
        String filePath = abrirArchivo();
        InputStream in = new FileInputStream(filePath);
        String thisLine;
        BufferedInputStream s = new BufferedInputStream(in);
        BufferedReader myInput = new BufferedReader(new InputStreamReader(s));
        ListaLigada values = new ListaLigada();
        double dato = 0;
        Nodo value = null;
        while ((thisLine = myInput.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(thisLine, delimiter);
            while(st.hasMoreElements()){
                try{
                    dato = Double.parseDouble((String) st.nextElement());
                } catch(NumberFormatException e){
                    System.out.println("Error al cargar los datos.\n Formato erròneo\nPor favor verifique el archivo e intente nuevamente :)");
                    ListaLigada leerDatos = leerDatos(delimiter);
                    return leerDatos;
                }                
                value = new Nodo(dato);
                values.addNodo(value);
            }
        }
        return(values);
    }
    
    
}
