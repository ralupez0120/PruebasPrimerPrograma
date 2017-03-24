/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class PrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        GestionDatos programa = new GestionDatos();
    /*
        ListaLigada columna1 = programa.leerDatos(",");
        JOptionPane.showMessageDialog(null,"Table: Columna1: \t\t\t Media: "+String.format("%.1f", Calculos.calcularMedia(columna1))+" Des Est: "+String.format("%.2f", Calculos.calcularVarianza(columna1)));
        ListaLigada columna2 = programa.leerDatos(",");
        JOptionPane.showMessageDialog(null,"Table: Columna1: \t\t\t Media: "+String.format("%.2f", Calculos.calcularMedia(columna2))+" Des Est: "+String.format("%.2f", Calculos.calcularVarianza(columna2)));
    */
        ListaLigada X = programa.leerDatos(",");
        ListaLigada Y = programa.leerDatos(",");
        double B0 = Calculos.calcularBetaCero(X, Y);
        double B1 = Calculos.calcularBetaUno(X, Y);
        System.out.println(String.format("%.4f",Calculos.calcularYkEnFuncionDeXk(B0, B1, 386)));
    }
    
}
