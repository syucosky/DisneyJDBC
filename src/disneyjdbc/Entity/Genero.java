package disneyjdbc.Entity;


public class Genero {
    private int id;
    private String nombre;

    public Genero(int codigo, String nombre) {
        this.nombre = nombre;
    }
    public Genero(){     
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
