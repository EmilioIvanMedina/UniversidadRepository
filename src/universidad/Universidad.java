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
       
        
        Carrera objCarrera = new Carrera();
        
        String sTitulo = "Listado de carreras: ";
        String listaDeCarreras = objCarrera.ListarCarreras();
        
        System.out.println(sTitulo + listaDeCarreras);
    }
    
}
