package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Serie extends Titulo {
    private ArrayList<Double> capitulosTemporada = new ArrayList<>();
    private int temporadas;

    public ArrayList<Double> getCapitulosTemporada() {
        return capitulosTemporada;
    }

    public void setCapitulosTemporada() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < temporadas; i++) {
            capitulosTemporada.add(scan.nextDouble());
        }
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void menu() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Sinopsis: " + getSinopsis());
        System.out.println("Valoraciones: " + getValoracion());
        System.out.println("Fecha de lanzamiento: " + getFechaLanzamiento());
        System.out.println("Incluido en el paquete basico: " + isIncluidoBasico());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Capítulos de temporadas: " + getCapitulosTemporada());
        System.out.println("Duración de un capitulo (aprox): " + getDuracion());
    }
    public void llenar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba el titulo de la serie");
        this.setTitulo(scan.nextLine());
        System.out.println("Escriba la sinopsis de la serie");
        this.setSinopsis(scan.nextLine());
        System.out.println("Escriba la valoración de la serie");
        this.setValoracion(scan.nextDouble());
        System.out.println("Escriba la fecha de lanzamiento de la serie");
        this.setFechaLanzamiento(scan.nextInt());
        System.out.println("Escriba si la serie se incluye en el paquete basico");
        this.setIncluidoBasico(scan.nextBoolean());
        System.out.println("Escriba el numero de temporadas de la serie");
        this.setTemporadas(scan.nextInt());
        System.out.println("Escriba el numero de capítulos de cada temporada de la serie");
        this.setCapitulosTemporada();
        System.out.println("Escriba la duración de un capitulo promedio");
        this.setDuracion(scan.nextInt());

        System.out.println("Terminado con exito!, volviendo al menu");
        System.out.println("------------");

        this.menu();

        System.out.println("------------");
    }
}
