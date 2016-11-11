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
public class Area {
    private int base, altura;

    public Area() {
    }

    public Area(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void area(){
        do{
            base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
        }while ((base)<=0);
        do{
            altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
        }while ((altura)<=0);
        int area = base * altura;
        System.out.println("El area es: " + area );
    }
}
