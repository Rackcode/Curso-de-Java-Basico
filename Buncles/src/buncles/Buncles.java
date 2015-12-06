/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buncles;

/**
 *
 * @author Alonso Campos
 */
public class Buncles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuncleWhile(10);
    }
    
    public static void BuncleFor(int numero){
        for (int i = 0; i < numero; i++) {
            System.out.println(i);
        }
    }
    public static void BuncleDoWhile(int numero){
        System.out.println(numero);
        do {  
            System.out.println(numero);
            numero--;
            
            System.out.println(numero);
        } while (numero==0);
        System.out.println(numero);
    }
    
    public static void BuncleWhile(int numero){
        int i =0;
        while(i<numero){
            numero--;
            System.out.println(numero);
        }
    }
    
    
    
    

    
    
    
    
}
