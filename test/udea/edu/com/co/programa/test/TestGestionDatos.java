/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.test;

import java.io.IOException;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;
import udea.edu.com.co.programa.GestionDatos;
import udea.edu.com.co.programa.ListaLigada;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class TestGestionDatos {
    GestionDatos objetoPrueba = new GestionDatos();
    String DOUBLE_PATTERN = "[0-9]+(.){0,1}[0-9]*";
    public TestGestionDatos() {
    }
       
    @Test
    public void testAbrirArchivo(){
        String path = objetoPrueba.abrirArchivo();
        assertTrue(path!="");
    }
    
    @Test
    public void testArchivoVacio() throws IOException{
        ListaLigada datosLeidos = new ListaLigada();
        datosLeidos = objetoPrueba.leerDatos(",");
        assertTrue(datosLeidos.getPrimero()!=null);
    }
    
    @Test
    public void testArchivosFloat() throws NumberFormatException, IOException{
        ListaLigada datosLeidos = new ListaLigada();
        datosLeidos = objetoPrueba.leerDatos(",");
        assertTrue(Pattern.matches(DOUBLE_PATTERN, String.valueOf(datosLeidos.getPrimero().getDato())));
    }
    
}
