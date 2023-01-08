
package disneyjdbc;

import disneyjdbc.Entity.Personaje;
import disneyjdbc.Service.PersonajeService;

public class DisneyJDBC {

    public static void main(String[] args) throws Exception {
       PersonajeService perService = new PersonajeService();
       Personaje per = new Personaje();
       
        try {
            per.setImagen("spiderman.jpg");
            per.setNombre("SpiderMan");
            per.setEdad(20);
            per.setPeso(65);
            per.setHistoria("lorem");
            per.setCodPelicula(1);
            perService.crearPersonaje(per);

        } catch (Exception e) {
            throw e;
        }
       
    }
    
}
