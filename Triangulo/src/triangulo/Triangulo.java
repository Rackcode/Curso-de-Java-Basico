/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alonso Campos
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base =Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Base"));
        int altura =Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Altura"));
        
        int area = base*altura/2;
        System.out.println(area);
        System.out.println("La Area del Triangulo es :"+AreaTriangulo(2.4, 2));
        
        
        
    }
    
    public static double AreaTriangulo(double base, double altura){
        double area = base*altura/2;
        return area;
    }
 
    public static void BuncleWhile(int numero){
        int i = 0;
        while(i < numero) {  
            System.out.println(numero);
            numero--;
            
        } 
    }
    
}
