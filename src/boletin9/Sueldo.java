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
public class Sueldo {
 
    
    public void salario(){
        int i=0;
        int acum1 = 0, acum2 = 0;
        double porcentaje = 0;
        double sueldo;
        
        do{
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce sueldo: "));
            if(sueldo >= 1000 && sueldo <= 1750) acum1 ++;
            else if (sueldo < 1000){
                acum2 += 1;
                porcentaje = (acum2/i) * 100;
        }
            i++;
        }while(sueldo!=0);
        
        System.out.println("El porcentaje es: " + porcentaje);
        System.out.println("La cantidad de trabajadores que cobran >1000 y <1750: " + acum1);
    }
}

