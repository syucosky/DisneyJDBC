package disneyjdbc.Persistence;

import disneyjdbc.Entity.Personaje;

public class PersonajeDao extends Dao {
    
    
    public void crearPersonaje(Personaje personaje)throws Exception{
        try {
            String sql = "INSERT INTO personaje(imagen,nombre,edad,peso,historia,cod_pelicula) "
                    + "VALUES ('" + personaje.getImagen()+ "','"+ personaje.getNombre() +"','"+ personaje.getEdad() +"','"+ personaje.getPeso() +"','"+ personaje.getHistoria() +"','"+ personaje.getCodPelicula() +"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
}
