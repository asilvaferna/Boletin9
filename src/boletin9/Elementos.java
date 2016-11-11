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
public class Elementos {
    
    public void serie(int n){
        int i, acum = 0;
        
        for(i=0; i<=n; i++){
            acum += 2;
            System.out.println(acum);
        }

    }
    public void serieDos(int n){
        int i, acum1= 1, acum2 = 0;
        int j=0;
        for(i=0; i<n; i++){
            if(j==0) {
                acum1+=-2;
                System.out.println(acum1);
                j=1; 
            }
            else {
                acum2+=2;
                j=0;
                System.out.println(acum2);
            }
        }
    }
    public void serieTres(int n){
        int i, acum = 0;
        int fib1 = 1, fib0 = 0;
        for (i=0; i<n; i++){
           switch(i){
               case 0: System.out.println(fib0);
               break;
               case 1: System.out.println(fib1);
               break;
               default: System.out.println((i-1)+(i-2));
           }
               
        }
    }
}
