/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Negativos {
    
    public void negativo(){
        int num, acu1 = 0, acu2 = 0, i = 0;
        for (i=0; i<10; i++){
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        if (num < 0) acu1 += 1;
        else if (num >= 0) acu2 += 1;
        
        }
        System.out.println("La cantidad de negativos es: " + acu1 + " y la cantidad de positivos es: " + acu2);
        
        
    }
}