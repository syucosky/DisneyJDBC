
package disneyjdbc;

import disneyjdbc.Entity.Genero;
import disneyjdbc.Entity.Personaje;
import disneyjdbc.Service.GeneroService;
import disneyjdbc.Service.PersonajeService;

public class DisneyJDBC {

    public static void main(String[] args) throws Exception {
       PersonajeService perService = new PersonajeService();
       GeneroService genService = new GeneroService();
       Genero gen = new Genero(); 
       Personaje per = new Personaje();
       
       /* try {
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
        try {      
            System.out.println(perService.editarPersonaje("Sebas", "SpiderMan", "nombre").getCodPelicula());
        } catch (Exception e) {
            throw e;
        }
        try {
            perService.eliminarPersonaje("SuperMan");
        } catch (Exception e) {
            throw e;
        }*/
        try {
            gen.setNombre("Aventuras");
            genService.crearGenero(gen);
        } catch (Exception e) {
            throw e;
        }
       
        
    }
    
}
