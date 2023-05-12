package pronosticosNuevoTP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NuevoTP {
    public static void main(String[] args) {
        
    	// PEDIMOS QUE EL PARTICIPANTE INGRESE SU NOMBRE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos a Pronósticos Deportivos. Por favor, ingrese su nombre: ");
        String participante = scanner.nextLine();
        scanner.close();

        // CREAMOS LOS EQUIPOS
        Equipo equipo1 = new Equipo("Equipo 1", "Descripción del equipo 1", 1);
        Equipo equipo2 = new Equipo("Equipo 2", "Descripción del equipo 2", 2);
        Equipo equipo3 = new Equipo("Equipo 3", "Descripción del equipo 3", 3);

        // CREAMOS LOS PARTIDOS
        Partido partido1 = new Partido(1, equipo1, equipo2, 2, 1);
        Partido partido2 = new Partido(2, equipo2, equipo3, 1, 1);
        Partido partido3 = new Partido(3, equipo3, equipo1, 0, 1);

        // CREAMOS LOS PRONOSTICOS
        Pronostico pronostico1 = new Pronostico(partido1, equipo1, Partido.ResultadoEnum.GANA_EQUIPO1);
        Pronostico pronostico2 = new Pronostico(partido2, equipo2, Partido.ResultadoEnum.EMPATE);
        Pronostico pronostico3 = new Pronostico(partido3, equipo3, Partido.ResultadoEnum.GANA_EQUIPO1);

        // LEEMOS LOS ARCHIVOS CSV
        String archivoResultados = "resultados.csv";
        String archivoPronosticos = "pronosticos.csv";

        // CREAMOS UNA LISTA PARA GUARDAR LOS RESULTADOS DE PARTIDOS
        List<Resultado> resultados = new ArrayList<>();
        
        // CALCULAMOS PUNTOS y MOSTRAMOS RESULTADOS DE PRONOSTICOS CREADOS
        List<Pronostico> pronosticos = new ArrayList<>();
        pronosticos.add(pronostico1);
        pronosticos.add(pronostico2);
        pronosticos.add(pronostico3);
        System.out.println("Pronósticos creados por el participante " + participante + ":");
        for (Pronostico pronostico : pronosticos) {
            int puntos = pronostico.Puntos();
            System.out.println("Pronóstico para el partido " + pronostico.getPartido().getId() + ": " + pronostico.getResultado());
            System.out.println("Puntos obtenidos: " + puntos);
            System.out.println();
        }
        
    }
}
