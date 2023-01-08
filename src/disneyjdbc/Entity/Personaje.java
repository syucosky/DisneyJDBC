package disneyjdbc.Entity;


public class Personaje {
    private int id;
    private String imagen;
    private String nombre;
    private int edad;
    private int peso;
    private String historia;
    private int codPelicula;

    public Personaje(int codigo ,String imagen, String nombre, int edad, int peso, String historia, int codPelicula) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.codPelicula = codPelicula;
    }
    public Personaje(){
        
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public int getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(int codPelicula) {
        this.codPelicula = codPelicula;
    }
    
    
    
}
