package pronosticosNuevoTP;

public class Partido {
		
	    // ACA COLOCO LOS ATRIBUTOS
	    private int id;
	    private Equipo equipo1;
	    private Equipo equipo2;
	    private int golesEquipo1;
	    private int golesEquipo2;
		    
	    // ACA HAGO EL CONSTRUCTOR
	    public Partido(int id, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
	        this.id = id;
	        this.equipo1 = equipo1;
	        this.equipo2 = equipo2;
	        this.golesEquipo1 = golesEquipo1;
	        this.golesEquipo2 = golesEquipo2;
	    }
	    
	    // ACA HAGO GETTERS y SETTERS
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public Equipo getEquipo1() {
	        return equipo1;
	    }
	    public void setEquipo1(Equipo equipo1) {
	        this.equipo1 = equipo1;
	    }
	    public Equipo getEquipo2() {
	        return equipo2;
	    }
	    public void setEquipo2(Equipo equipo2) {
	        this.equipo2 = equipo2;
	    }
	    public int getGolesEquipo1() {
	        return golesEquipo1;
	    }
	    public void setGolesEquipo1(int golesEquipo1) {
	        this.golesEquipo1 = golesEquipo1;
	    }
	    public int getGolesEquipo2() {
	        return golesEquipo2;
	    }
	    public void setGolesEquipo2(int golesEquipo2) {
	        this.golesEquipo2 = golesEquipo2;
	    }

	    // ACA HAGO EL METODO RESULTADO ENUM
	    public ResultadoEnum resultado(Equipo equipo) {
	        if (this.golesEquipo1 == this.golesEquipo2) {
	            return ResultadoEnum.EMPATE;
	        } else if (this.equipo1.equals(equipo) && this.golesEquipo1 > this.golesEquipo2) {
	            return ResultadoEnum.GANA_EQUIPO1;
	        } else if (this.equipo2.equals(equipo) && this.golesEquipo2 > this.golesEquipo1) {
	            return ResultadoEnum.GANA_EQUIPO2;
	        } else {
	            return null;
	        }
	    }
	    
	    // ACA HAGO ENUM
	    public enum ResultadoEnum {
	        GANA_EQUIPO1,
	        GANA_EQUIPO2,
	        EMPATE
	    }
	}
