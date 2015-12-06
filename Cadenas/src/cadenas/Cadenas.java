/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alonso Campos
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Persona persona = new Persona();
        persona.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre"));
        persona.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")));
        persona.setEstatura(Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu estatura")));
        
        Persona persona2 = new Persona();
        persona2.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre"));
        persona2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")));
        persona2.setEstatura(Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu estatura")));
        
        if(persona.getEdad()==persona2.getEdad()){
            JOptionPane.showMessageDialog(null, "Son de la misma edad");
        }else if(persona.getEdad()< persona2.getEdad()){
            JOptionPane.showMessageDialog(null, persona.getNombre()+" es mas pequeño de edad a "+ persona2.getNombre());
        }else{
            JOptionPane.showMessageDialog(null, persona.getNombre()+" es mayor a "+ persona2.getNombre());
        }
        
        if(persona.getNombre().equals(persona2.getNombre())){
            JOptionPane.showMessageDialog(null, "Tiene el mismo nombre");
        }
        if(persona.getNombre().equalsIgnoreCase(persona.getNombre())){
            JOptionPane.showMessageDialog(null, "Tiene el mismo nombre aunque esta escrito de forma distinta");
        }
        
        
        
    }
    
    
    
    
    
}
