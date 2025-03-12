/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fl23029152_pp2;

/**
 *
 * @author fernandafajardo
 */
public class Lista {
    private Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
    
    /***
     * Inserta un nuevo nodo con el valor especificado al final de la lista.
     * @author Fernanda Fajardo
     * @param valor El valor entero que se almacenará en el nuevo nodo.
     */
    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if(primero == null){
            primero = nuevo;
        }else{
            Nodo aux = primero;
            while(aux.getSig() != null){
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
    }
    
    /***
     * Verfica si el número especificado ya está presente en la lista enlazada.
     * @author Fernanda Fajardo
     * @param valor El número que se desea buscar en la lista
     * @return true si el número ya existe en la lista, false si no se encuentra
     */
    public boolean numRepetido(int valor){
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getDato() == valor) {
                return true;  // El número ya ha aparecido antes.
            }
            actual = actual.getSig();
        }
        return false;
    }

}
