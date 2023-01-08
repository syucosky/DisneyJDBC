package disneyjdbc.Service;

import disneyjdbc.Entity.Personaje;
import disneyjdbc.Persistence.PersonajeDao;

public class PersonajeService {
    private PersonajeDao dao;
    
    public PersonajeService(){
        this.dao = new PersonajeDao();
    }
    public void crearPersonaje(Personaje personaje) throws Exception{
        try {
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
    
}
