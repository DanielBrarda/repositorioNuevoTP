package pronosticosNuevoTP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

    	public class nuevoTP {
    	    
    	    public static void main(String[] args) {
    	        
    	// ACA PEDIMOS QUE EL PARTICIPANTE INGRESE SU NOMBRE
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.print("Bienvenidos a Pronósticos Deportivos. Por favor, ingrese su nombre: ");
    	        String participante = scanner.nextLine();
    	        
    	// ACA CREAMOS 6 INSTANCIAS DE LA CLASE EQUIPO
    	        Equipo equipo1 = new Equipo("Equipo 1", "Seleccionado", 1);
    	        Equipo equipo2 = new Equipo("Equipo 2", "Seleccionado", 2);
    	        Equipo equipo3 = new Equipo("Equipo 3", "Seleccionado", 3);
    	        Equipo equipo4 = new Equipo("Equipo 4", "Seleccionado", 4);
    	        Equipo equipo5 = new Equipo("Equipo 5", "Seleccionado", 5);
    	        Equipo equipo6 = new Equipo("Equipo 6", "Seleccionado", 6);
    	        
    	// ACA LEEMOS LOS ARCHIVOS CSV
    	        String archivoResultados = "resultados.csv";
    	        String archivoPronosticos = "pronosticos.csv";
    	        String[] resultados = null;
    	        String[] pronosticos = null;
    	        
    	// ACA HACEMOS TRY CATCH
    	        try {
    	            resultados = Files.readAllLines(Paths.get(archivoResultados)).toArray(new String[0]);
    	            pronosticos = Files.readAllLines(Paths.get(archivoPronosticos)).toArray(new String[0]);
    	        } catch (IOException e) {
    	            System.err.println("Error al leer los archivos de resultados y pronósticos.");
    	            e.printStackTrace();
    	            System.exit(1);
    	        }
    	        
    	// ACA BUSCAMOS LAS COINCIDENCIAS PARA EL NOMBRE DEL PARTICIPANTE Y CALCULAMOS EL PUNTAJE
    	        int puntaje = 0;
    	        boolean participanteUnico = false;

    	        for (int i = 0; i < resultados.length; i++) {
    	            String[] resultadosPartido = resultados[i].split(",");
    	            String[] pronosticosPartido = pronosticos[i].split(",");

    	            if (resultadosPartido[0].equals(participante)) {
    	                participanteUnico = true;
    	                
    	// ACA OBTENEMOS EL RESULTADO DEL PARTIDO
    	                int golesEquipo1 = Integer.parseInt(resultadosPartido[1]);
    	                int golesEquipo2 = Integer.parseInt(resultadosPartido[2]);

    	// ACA OBTENEMOS EL PRONOSTICO DEL PARTIDO
    	                int golesEquipo1Pronosticado = Integer.parseInt(pronosticosPartido[1]);
    	                int golesEquipo2Pronosticado = Integer.parseInt(pronosticosPartido[2]);

    	// ACA COMPARAMOS RESULTADO CON PRONOSTICO
    	                if (golesEquipo1 == golesEquipo1Pronosticado && golesEquipo2 == golesEquipo2Pronosticado) {
    	                    puntaje += 1;
    	                } else if ((golesEquipo1 > golesEquipo2 && golesEquipo1Pronosticado > golesEquipo2Pronosticado) ||
    	                          (golesEquipo1 == golesEquipo2 && golesEquipo1Pronosticado == golesEquipo2Pronosticado) ||
    	                          (golesEquipo1 < golesEquipo2 && golesEquipo1Pronosticado < golesEquipo2Pronosticado)) {
    	                    puntaje += 1;
    	                }
    	            }
    	        }
    	        
    	// ACA IMPRIMIMOS EL PUNTAJE DEL PARTICIPANTE
    	        if (participanteUnico) {
    	            System.out.println("El puntaje de " + participante + " es: " + puntaje);
    	        } else {
    	            System.out.println("No se encontraron resultados para el participante " + participante);
    	        }
    	    }
    	}
    	