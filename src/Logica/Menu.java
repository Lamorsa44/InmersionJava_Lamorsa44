package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final Scanner scan = new Scanner(System.in);
    private static ArrayList<Titulo> titulos = new ArrayList<>();
    private static boolean centinel = true;

    public Menu() {
        abrirMenu();
    }

    private static void abrirMenu() {
        System.out.println("---- Bienvenido, seleccione la opcion deseada ----");
        System.out.println("---- 1) Registrar pelicula ");
        System.out.println("---- 2) Registrar serie ");
        System.out.println("---- 3) Calculadora de tiempo ");
        System.out.println("------------------------------");
        System.out.println("---- 9) Salir ");

        registrarOpcion();
        scan.nextLine();
    }

    private static void registrarOpcion() {

        while (!scan.hasNextInt()) {
            System.out.println("Prueba con un numero .v.");
            scan.nextLine();
        }
        int opcion = scan.nextInt();

        while (centinel) {

            switch (opcion) {
                case 1 -> registrarPelicula();
                case 2 -> registrarSerie();
                case 3 -> calculadoraTiempo();
                case 9 -> salir();
                default -> registrarOpcion();
            }
        }

    }

    private static void salir() {
        System.out.println("Hasta luego");
        centinel = false;
    }

    private static void calculadoraTiempo() {
        double minutosTotales = 0;
        for (var titulo : titulos) {
            if (titulo instanceof Serie serie) {
                minutosTotales += ( serie.getCapitulosTemporada().stream().mapToDouble(Double::doubleValue).sum() * serie.getDuracion());
            }
            else {
                if (titulo instanceof Pelicula pelicula) {
                    minutosTotales += pelicula.getDuracion();
                }
            }
        }
        System.out.println(minutosTotales);
        abrirMenu();
    }

    private static void registrarSerie() {
        scan.nextLine();

        try {
            Serie serie = new Serie();
            serie.llenar();
            titulos.add(serie);

            abrirMenu();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void registrarPelicula() {
        scan.nextLine();

        try {
            Pelicula pelicula = new Pelicula();
            pelicula.llenar();
            titulos.add(pelicula);

            abrirMenu();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
