/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fl23029152_pp2;

import java.util.Scanner;

/**
 *
 * @author fernandafajardo
 */
public class Fl23029152_PP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // tamaño arreglo
        int [] arreglo = new int [num];
        
        //Lee los elem del arreglo
        for(int i = 0; i < num; i++){
            arreglo[i] = scanner.nextInt();
        }
                
        Lista lista = new Lista();
        int primerRepetido = -1;
        
        for(int i = 0; i < num; i++){
            if(lista.numRepetido(arreglo[i])){
                primerRepetido = arreglo[i]; // Acá encontro el número repetido
                break;
            }
            lista.insertar(arreglo[i]);
        }
        
        System.out.println(primerRepetido);
        scanner.close();
    }
    
}
