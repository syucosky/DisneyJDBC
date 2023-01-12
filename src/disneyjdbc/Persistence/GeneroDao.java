package disneyjdbc.Persistence;

import disneyjdbc.Entity.Genero;

public class GeneroDao extends Dao{
    
    
    public Genero buscarPorNombre(String nombre) throws Exception{
        try {
            String sql = "SELECT * FROM genero WHERE nombre = '" + nombre +"';";
            consultar(sql);
            Genero gen = new Genero();
            while(resultado.next()){
                gen.setId(resultado.getInt("idGenero"));
                gen.setNombre(resultado.getString("nombre"));
            }
            desconeccion();
            return gen;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void creacionGenero(Genero genero)throws Exception{
        try {
            String sql = "INSERT INTO genero(nombre) VALUES ('"+ genero.getNombre()+"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
