/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fl23029152_pp2;

/**
 *
 * @author fernandafajardo
 */
public class ListaAlum {
    
    private NodoAlum primero;

    public ListaAlum() {
        this.primero = null;
    }
    
    /***
     * Inserta una edad en la lista enlazada de manera ordenada.
     * @author Fernanda Fajardo
     * @param edad La edad que se va a insertar en la lista
     */
    public void insertar(int edad) {
        NodoAlum nuevo = new NodoAlum(edad);

        // Si la lista está vacía, agregamos el primer nodo
        if (primero == null) {
            primero = nuevo;
            return;
        }

        NodoAlum actual = primero;
        NodoAlum anterior = null;

        // Buscamos el lugar adecuado para insertar el nuevo nodo
        while (actual != null && actual.getEdad() < edad) {
            anterior = actual;
            actual = actual.getSig();
        }

        // Si encontramos un nodo con la misma edad, incrementamos el contador
        if (actual != null && actual.getEdad() == edad) {
            actual.setCant(actual.getCant() + 1);
        } else {
            // Si no lo encontramos, insertamos el nuevo nodo
            if (anterior == null) {
                // Insertamos al principio si la edad es menor que todas las anteriores
                nuevo.setSig(primero);
                primero = nuevo;
            } else {
                // Insertamos en medio o al final
                anterior.setSig(nuevo);
                nuevo.setSig(actual);
            }
        }
    }
    
    /***
     * Imprime todas las edades y sus respectivas cantidades en la lista.
     * @author Fernanda Fajardo
     */
    public void imprimir(){
        NodoAlum actual = primero;
        while(actual != null){
            System.out.println(actual.getEdad() + " " + actual.getCant());
            actual = actual.getSig();
        }
    }
}
