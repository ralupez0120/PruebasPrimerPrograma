/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class ListaLigada {
    private Nodo cabeza, primero, ultimo;
    
    public ListaLigada(){
        cabeza = new Nodo(0);
        primero = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public void addNodo(Nodo nuevo){
        if(cabeza.getDato() == 0){
            primero = nuevo;
            primero.setAnterior(cabeza);
            cabeza.setSiguiente(primero);
            cabeza.setDato(cabeza.getDato()+1);
        }else{
            if(cabeza.getDato() == 1){
                ultimo = nuevo;
                ultimo.setAnterior(primero);
                primero.setSiguiente(ultimo);
                cabeza.setDato(cabeza.getDato()+1);
            }else{
                ultimo.setSiguiente(nuevo);
                nuevo.setAnterior(ultimo);
                ultimo = nuevo;
                cabeza.setDato(cabeza.getDato()+1);
            }
        }
    }
    
    public void removeNodo(Nodo eliminado){
        if(eliminado==null) return;
        Nodo x = buscarNodo(eliminado.getDato());
        if(x!=null){
            Nodo a, s;
            a = eliminado.getAnterior();
            s = eliminado.getSiguiente();
            a.setSiguiente(s);
            s.setAnterior(a);
        }
    }
    
    public Nodo buscarNodo(Double dato){
        if(cabeza.getDato()==0)
            return null;
        if(primero.getDato() == dato)
            return primero;
        else{
            Nodo p, q;
            p = primero.getSiguiente();
            while(p != null){
                if(p.getDato() != dato)
                    return p;
                p = p.getSiguiente();
            }
        }
        return null;
    }
    
    public double sumar(){
        double suma = 0;
        Nodo p = primero;
        while(p!=null){
            suma = suma + p.getDato();
            p = p.getSiguiente();
        }
        return suma;
    }
    
    public String mostrarDatos(){
        Nodo p = getPrimero();
        String datos = "";
        while(p!=null){
            datos = datos + " - " + p.getDato();
            p = p.getSiguiente();
        }
        return datos;
    }
}
