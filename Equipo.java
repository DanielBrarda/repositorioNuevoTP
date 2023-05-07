package pronosticosNuevoTP;

public class Equipo {

	//ACA COLOCO LOS ATRIBUTOS 
	    private String nombre;
	    private String descripcion;
	    private int id;
	    
	//ACA HAGO EL CONSTRUCTOR    
	    public Equipo(String nombre, String descripcion, int id) {
	        this.nombre = nombre;
	        this.descripcion = descripcion;
	        this.id = id;
	    }

		// ACA HAGO GETTERS y SETTERS
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
	    public void setId(String nombre) {
	        this.id = id;
}
}