/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa;

/**
 *
 * @author DAVID, RAFAEL, SANTIAGO
 */
public class Calculos {
    
    public static double calcularMedia(ListaLigada datos){
        double media = 0;
        if(datos.getCabeza().getDato()==0)
            return media;
        else{
            double numerador;
            numerador = datos.sumar();
            media = numerador/datos.getCabeza().getDato();
        }
        return media;
    }
    
    public static double calcularVarianza(ListaLigada datos){
        if(datos.getCabeza().getDato()==0) return -1;
        double varianza = 0, n, diferencia = 0, media = calcularMedia(datos);
        n = datos.getCabeza().getDato();
        Nodo p = datos.getPrimero();
        while(p!=null){
            diferencia = diferencia + Math.pow((p.getDato() - media),2);
            p = p.getSiguiente();
        }
        varianza = Math.sqrt((1/(n-1))*diferencia);
        return varianza;
    }
}
