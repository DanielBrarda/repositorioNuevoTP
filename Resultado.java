package pronosticosNuevoTP;

public class Resultado {
	
	//ACA COLOCO ATRIBUTOS
	private int golesEquipo1;
    private int golesEquipo2;
    
    // ACA HACEMOS CONSTRUCTOR
    public Resultado(int golesEquipo1, int golesEquipo2) {
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    
    //ACA HACEMOS GETTERS y SETTERS
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
}
