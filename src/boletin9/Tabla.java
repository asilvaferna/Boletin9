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
public class Tabla {

    public void multiplica(){
        int i = 0, num = 1;
         num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero :"));
        while (num !=0){   
            for (i=0; i<=10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
         num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero :"));
        }
        }
}
