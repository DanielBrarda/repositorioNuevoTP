package pronosticosNuevoTP;

public class Equipo {
		
	// ACA COLOCO ATRIBUTOS
    private String nombre;
    private String descripcion;
    private int id;
    
    // ACA HACEMOS CONSTRUCTOR
    public Equipo(String nombre, String descripcion, int id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }
    
    // ACA HACEMOS GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
