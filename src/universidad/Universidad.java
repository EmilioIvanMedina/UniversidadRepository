/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author emedinam
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carrera objCarrera = new Carrera();
        
        String listaDeCarreras = objCarrera.ListarCarreras();
        
        System.out.println("Carreras: " + listaDeCarreras);
        
    }
    
}
