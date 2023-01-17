package disneyjdbc.Service;

import disneyjdbc.Entity.Pelicula;
import disneyjdbc.Persistence.PeliculaDao;
import java.util.List;


public class PeliculaService {
    private PeliculaDao dao;
    
    public PeliculaService(){
        this.dao = new PeliculaDao();
    }
    
    public void crearPelicula(Pelicula peli) throws Exception{
        try {
            dao.crearPelicula(peli);
        } catch (Exception e) {
            throw e;
        }
    }
    public void editarPelicula(String titulo, String nuevoDato, String columna)throws Exception{
        try {
            if(dao.buscarPeliPorTitulo(titulo) == null){
                throw new Exception("Pelicula no encontrado");
            }else{
                dao.editarPelicula(titulo, nuevoDato, columna);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public void eliminarPelicula(String titulo) throws Exception{
        try {
            if(dao.buscarPeliPorTitulo(titulo).getTitulo() == null){
                throw new Exception("Pelicula no encontrada");
            }else{
                dao.eliminarPelicula(titulo);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public List<Pelicula> buscarConFiltro(String titulo, String ascODesc, String genero) throws Exception{
        try {
            return dao.buscarConFiltro(titulo, ascODesc, genero);
        } catch (Exception e) {
            throw e;
        }                        
    }    
}
