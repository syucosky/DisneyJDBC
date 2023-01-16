package disneyjdbc.Service;

import disneyjdbc.Entity.Personaje;
import disneyjdbc.Persistence.PersonajeDao;
import java.util.ArrayList;
import java.util.List;

public class PersonajeService {
    private PersonajeDao dao;
    
    public PersonajeService(){
        this.dao = new PersonajeDao();
    }
    public void crearPersonaje(Personaje personaje) throws Exception{
        try {
           if (dao.buscarPersonajePorNombre(personaje.getNombre()) != null){
               throw new Exception("El nombre del personaje ya existe");
           }
           if (personaje == null){
               throw new Exception("Debe indicar un personaje");
           }
           if(personaje.getNombre() == null || personaje.getNombre().trim().isEmpty()){
               throw new Exception("Debe indicar el nombre");             
           }
           if(personaje.getNombre().length() > 20){
               throw new Exception("El nombre excede el tamaño permitido");
           }
           if(personaje.getCodPelicula() == 0){
               throw new Exception("Debe indicar el codigo de pelicula");
           }
           dao.crearPersonaje(personaje);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    public Personaje editarPersonaje(String nombre, String nuevoDato,String columna )throws Exception{
        try {
            if(dao.buscarPersonajePorNombre(nombre).getNombre() == null){
                throw new Exception("Personaje no encontrado");
            }else{
                dao.editarPersonaje(nombre, nuevoDato, columna);
            }    
        } catch (Exception e) {
            throw e;
        }
        return dao.buscarPersonajePorNombre(nuevoDato);
    }
    public void eliminarPersonaje(String nombre)throws Exception{
        try {
            if(dao.buscarPersonajePorNombre(nombre).getNombre() == null){
                throw new Exception("Personaje no encontrado");
            }else{
                dao.eliminarPersonaje(nombre);
            }  
        } catch (Exception e) {
        }
    }
    public Personaje detallePersonaje(String nombre)throws Exception{
        try {
            if(dao.buscarPersonajePorNombre(nombre).getNombre() == null){
                throw new Exception("Personaje no encontrado");
            }else{
                return dao.buscarPersonajePorNombre(nombre);
            }    
        }catch (Exception e) {
            throw e;
        }
    }
    public List<Personaje> busquedaPorFiltro(String nombre, String nuevoDato,String columna )throws Exception{
        try {
            if(dao.buscarPersonajePorNombre(nombre).getNombre() == null){
                throw new Exception("Personaje no encontrado");
            }else{
                return dao.busquedaPorFiltro(nombre, nuevoDato, columna);
            }   
        } catch (Exception e) {
            throw e;
        }
    }
}
