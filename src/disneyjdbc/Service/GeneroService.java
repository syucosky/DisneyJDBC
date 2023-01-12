package disneyjdbc.Service;

import disneyjdbc.Entity.Genero;
import disneyjdbc.Persistence.GeneroDao;

public class GeneroService {
   private GeneroDao dao;
    
    public GeneroService(){
        this.dao = new GeneroDao();
    }
    public void crearGenero(Genero gen) throws Exception{
        try {
            if(dao.buscarPorNombre(gen.getNombre()).getNombre() != null ){
                throw new Exception("Nombre del genero ya existe");
            }
            dao.creacionGenero(gen);
        } catch (Exception e) {
        }
    }
}
