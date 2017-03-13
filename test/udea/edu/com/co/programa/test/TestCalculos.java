/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.test;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import static udea.edu.com.co.programa.Calculos.calcularMedia;
import static udea.edu.com.co.programa.Calculos.calcularVarianza;
import udea.edu.com.co.programa.GestionDatos;
import udea.edu.com.co.programa.ListaLigada;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class TestCalculos {
    GestionDatos prueba = new GestionDatos();
    double media;
    
    @Test
    public void mediaCero() throws IOException{
        ListaLigada datos = prueba.leerDatos(",");
        media = calcularMedia(datos);
        assertTrue(media!=0);
    }
    
    @Test
    public void mediaNegativa() throws IOException{
        ListaLigada datos = prueba.leerDatos(",");
        media = calcularMedia(datos);
        assertTrue(media>0);
    }
    
    @Test
    public void varianzaNegativa() throws IOException{
        ListaLigada datos = prueba.leerDatos(",");
        media = calcularVarianza(datos);
        assertTrue(media>0);
    }
}
