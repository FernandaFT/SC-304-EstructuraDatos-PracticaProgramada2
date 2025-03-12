/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fl23029152_pp2;

/**
 *
 * @author fernandafajardo
 */
public class NodoAlum {
    private int edad;
    private int cant; // cant de veces que se repita la edad
    private NodoAlum sig;

    public NodoAlum(int edad) {
        this.edad = edad;
        this.cant = 1; // inicialmente cada edad se cuenta 1 vez
        this.sig = null;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public NodoAlum getSig() {
        return sig;
    }

    public void setSig(NodoAlum sig) {
        this.sig = sig;
    }  
}
