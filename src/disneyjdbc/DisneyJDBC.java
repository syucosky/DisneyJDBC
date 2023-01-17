
package disneyjdbc;

import disneyjdbc.Entity.Genero;
import disneyjdbc.Entity.Pelicula;
import disneyjdbc.Entity.Personaje;
import disneyjdbc.Service.GeneroService;
import disneyjdbc.Service.PeliculaService;
import disneyjdbc.Service.PersonajeService;
import java.util.ArrayList;
import java.util.List;

public class DisneyJDBC {

    public static void main(String[] args) throws Exception {
        
       PersonajeService perService = new PersonajeService();
       GeneroService genService = new GeneroService();
       PeliculaService peliService = new PeliculaService();
       
       Pelicula peli = new Pelicula();
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
        }
        try {
            gen.setNombre("Aventuras");
            genService.crearGenero(gen);
        } catch (Exception e) {
            throw e;
        }
        try {
            peli.setImagen("FlorPeli");
            peli.setTitulo("Flor films");
            peli.setFecha("1022023");
            peli.setCalificacion(10);
            peli.setCodGenero(5);
            peliService.crearPelicula(peli);
        } catch (Exception e) {
            throw e;
        }       
        try {
            peliService.eliminarPelicula("Seba films");
        } catch (Exception e) {
            throw e;
        }
       try {
            peliService.editarPelicula("Flor films", "1991", "fecha");
        } catch (Exception e) {
            throw e;
        }*/
        try {
            List<Pelicula> pruebaPeli = new ArrayList();
            pruebaPeli = peliService.buscarConFiltro("flor films", "ascendente", "5");
            for(Pelicula p : pruebaPeli) {
                System.out.println(p.getTitulo());
                System.out.println(p.getFecha());
            }
        } catch (Exception e) {
            throw e;
        }
                
        
    }
    
}
