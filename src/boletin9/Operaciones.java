/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

/**
 *
 * @author Adri
 */
public class Operaciones {
    public void operacion(){
        int i, suma = 0;
        double producto = 1;
        for (i=10; i<=90; i++){
            suma += i;
            producto *= i;
        }
        System.out.println("La suma es " + suma);    
        System.out.println("El producto es " + producto);
    }
}
