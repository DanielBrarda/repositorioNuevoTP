package pronosticosNuevoTP;

public class Pronostico {
	
	//ACA COLOCO ATRIBUTOS
	    private Partido partido;
	    private Equipo equipo;
	    private Partido.ResultadoEnum resultado;

	//ACA HAGO EL CONSTRUCTOR
	    public Pronostico(Partido partido, Equipo equipo, Partido.ResultadoEnum resultado) {
	        this.partido = partido;
	        this.equipo = equipo;
	        this.resultado = resultado;
	    }

	//ACA HAGO GETTERS y SETTERS
	    public Partido getPartido() {
	        return partido;
	    }
	    public void setPartido(Partido partido) {
	        this.partido = partido;
	    }
	    public Equipo getEquipo() {
	        return equipo;
	    }
	    public void setEquipo(Equipo equipo) {
	        this.equipo = equipo;
	    }
	    public Partido.ResultadoEnum getResultado() {
	        return resultado;
	    }
	    public void setResultado(Partido.ResultadoEnum resultado) {
	        this.resultado = resultado;
	    }

    //ACA HAGO METODO PUNTOS
	    public int Puntos() {
	        int puntos = 0;
	        Partido.ResultadoEnum resultado = this.partido.resultado(this.equipo);
	        if (resultado == this.resultado) {
	            puntos = 1; 
	        }
	        return puntos;
	    }
	}
