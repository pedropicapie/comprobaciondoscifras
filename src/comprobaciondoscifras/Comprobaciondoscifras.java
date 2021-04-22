/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobaciondoscifras;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Comprobaciondoscifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
        
        System.out.println("Escribe un numero cualquiera ");
        int numero1 = leer.nextInt();
        
        if (numero1>=10 && numero1<=99){
            System.out.println("Tiene dos cifras");
        }else{
            System.out.println("Distinto de dos cifras");
        }
    }
    
    
}
