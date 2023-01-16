package disneyjdbc.Entity;

import java.util.List;

public class Pelicula {
    private int id;
    private String imagen;
    private String titulo;
    private String fecha;
    private int calificacion;
    private int codGenero;

    public Pelicula(int codigo, String imagen, String titulo, String fecha, int calificacion, int codGenero) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.codGenero = codGenero;
    }
    public Pelicula(){
        
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
    }

    
    
    
    
}
