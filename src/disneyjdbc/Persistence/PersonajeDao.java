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
    public Personaje buscarPersonajePorNombre(String nombre) throws Exception{
        try {
            String sql = "SELECT * FROM personaje WHERE nombre = '" + nombre +"'";
            consultar(sql);
            Personaje pers = new Personaje();
            while(resultado.next()){
                pers.setId(resultado.getInt("idPersonaje"));
                pers.setImagen(resultado.getString("imagen"));
                pers.setNombre(resultado.getString("nombre"));
                pers.setEdad(resultado.getInt("edad"));
                pers.setPeso(resultado.getInt("peso"));
                pers.setHistoria(resultado.getString("historia"));
                pers.setCodPelicula(resultado.getInt("cod_pelicula"));
            }
            desconeccion();
            return pers;
        } catch (Exception e) {
            desconeccion();
            throw e;
        } 
        
    }
    public void editarPersonaje(String nombre, String nuevoDato, String columna)throws Exception{
        try {
            if(columna.equals("peso") || columna.equals("edad") || columna.equals("cod_pelicula") ){
                int datoEdadPesoCodPeli = Integer.parseInt(nuevoDato);
                String sql = "UPDATE personaje SET " + columna + " = " + datoEdadPesoCodPeli +" WHERE nombre = '" + nombre + "';";
                insertarModificarEliminar(sql);
            }else{
                String sql = "UPDATE personaje SET '" + columna + "' = '" + nuevoDato +"' WHERE nombre = '" + nombre + "';";
                insertarModificarEliminar(sql);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public void eliminarPersonaje(String nombre) throws Exception{
        try {
            String sql = "DELETE  FROM personaje WHERE nombre = '" + nombre +"';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
