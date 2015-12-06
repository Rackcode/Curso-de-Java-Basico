/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Alonso Campos
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParImpar();
    }
    public static void ParImpar(){
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero")), resto;
            resto = numero%2;
        
            if (resto==0) {
                JOptionPane.showMessageDialog(null, "Este numero es par: "+numero);
            }else{
                JOptionPane.showMessageDialog(null, "Este numero es impar: "+ numero);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A sucedido algo inesperado intenta mas tarde");
        }
        
        
       
    }
    
}
