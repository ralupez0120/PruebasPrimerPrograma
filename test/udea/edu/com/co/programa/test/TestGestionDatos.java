/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.test;

import java.io.IOException;
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
    
}
