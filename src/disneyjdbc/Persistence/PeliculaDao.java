package disneyjdbc.Persistence;

import disneyjdbc.Entity.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDao extends Dao{
    
    public void crearPelicula(Pelicula peli) throws Exception{
        try {
            String sql = "INSERT INTO pelicula(imagen,titulo,fecha,calificacion,cod_genero) "
                    + "VALUES "
                    + "('"+ peli.getImagen() +"','"+peli.getTitulo()+"','"+peli.getFecha()+"',"+peli.getCalificacion()+","+ peli.getCodGenero()+");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public Pelicula buscarPeliPorTitulo(String titulo) throws Exception{
        try {
            String sql = "SELECT * FROM pelicula WHERE titulo = '" + titulo +"'";
            consultar(sql);
            Pelicula peli = new Pelicula();
            while (resultado.next()){
                peli.setImagen(resultado.getString("imagen"));
                peli.setTitulo(resultado.getString("titulo"));
                peli.setFecha(resultado.getString("fecha"));
                peli.setCalificacion(resultado.getInt("calificacion"));
                peli.setCodGenero(resultado.getInt("cod_genero"));            
            }
            desconeccion();
            return peli;
        } catch (Exception e) {
            desconeccion();
            throw e;
        }
    }
    public void editarPelicula(String titulo, String nuevoDato, String columna) throws Exception{
        try {
            if(columna.equals("calificacion") || columna.equals("cod_genero")){
                int nuevoDatoParseado = Integer.parseInt(nuevoDato);
                String sql = "UPDATE pelicula SET '" + columna + "' = " + nuevoDatoParseado + "WHERE titulo = '" + titulo +"'";
                insertarModificarEliminar(sql);
            }else{
                String sql = "UPDATE pelicula SET " + columna + " = '" + nuevoDato + "' WHERE titulo = '" + titulo +"'";           
                insertarModificarEliminar(sql);
            }
        } catch (Exception e) {
            throw e;
        }            
    }
    
    public void eliminarPelicula(String titulo) throws Exception{
        try {
            String sql = "DELETE FROM pelicula WHERE titulo = '" + titulo +"';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public List<Pelicula> buscarConFiltro(String titulo, String ascODesc, String genero) throws Exception{
        try {
            if (titulo.isEmpty() && ascODesc.isEmpty() && genero.isEmpty()){
                String sql = "SELECT * FROM pelicula";
                consultar(sql);
            }
            if (ascODesc.equals("ascendente")){
                int generoParseado = Integer.parseInt(genero);
                String sql = "SELECT * FROM pelicula WHERE titulo = '"+ titulo +"' AND cod_genero = " + generoParseado + "ORDER BY fecha ASC;";
                consultar(sql);
            }
            if(ascODesc.equals("descendente")){
                int generoParseado = Integer.parseInt(genero);
                String sql = "SELECT * FROM pelicula WHERE titulo = '"+ titulo +"' AND cod_genero = " + generoParseado + "ORDER BY fecha DESC;";
                consultar(sql);
            }
            if(ascODesc.isEmpty()){
                int generoParseado = Integer.parseInt(genero);
                String sql = "SELECT * FROM pelicula WHERE titulo = '"+ titulo +"' AND cod_genero = " + generoParseado + ";";    
                consultar(sql);
            }
            if(genero.isEmpty() && ascODesc.equals("ascendente")){
                String sql = "SELECT * FROM pelicula WHERE titulo = '" + titulo + "' ORDER BY fecha ASC";
                consultar(sql);
            }
            if(genero.isEmpty() && ascODesc.equals("descendente")){
                String sql = "SELECT * FROM pelicula WHERE titulo = '" + titulo + "' ORDER BY fecha DES";
                consultar(sql);
            }
            if(ascODesc.isEmpty() && genero.isEmpty()){
                int generoParseado = Integer.parseInt(genero);
                String sql = "SELECT * FROM pelicula WHERE titulo = '"+ titulo +";";
                consultar(sql);
            }
            List<Pelicula> listaRetorno = new ArrayList();
            Pelicula peliRetorno = new Pelicula();
            while(resultado.next()){
                peliRetorno.setImagen(resultado.getString("imagen"));
                peliRetorno.setTitulo(resultado.getString("titulo"));
                peliRetorno.setFecha(resultado.getString("fecha"));
                peliRetorno.setCalificacion(resultado.getInt("calificacion"));
                peliRetorno.setCodGenero(resultado.getInt("cod_genero"));
                listaRetorno.add(peliRetorno);
            }
            desconeccion();
            return listaRetorno;
        } catch (Exception e) {
            desconeccion();
            throw e;
        }
    }
    
}
