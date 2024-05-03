package Logica;

import java.util.Scanner;

public class Pelicula extends Titulo {

    @Override
    public void menu() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Sinopsis: " + getSinopsis());
        System.out.println("Valoraciones: " + getValoracion());
        System.out.println("Fecha de lanzamiento: " + getFechaLanzamiento());
        System.out.println("Incluido en el paquete basico: " + isIncluidoBasico());
        System.out.println("Duracion: " + getDuracion());
    }

    @Override
    public void llenar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba el titulo de la pelicula");
        this.setTitulo(scan.nextLine());
        System.out.println("Escriba la sinopsis de la pelicula");
        this.setSinopsis(scan.nextLine());
        System.out.println("Escriba la valoracion de la pelicula");
        this.setValoracion(scan.nextDouble());
        System.out.println("Escriba la fecha de lanzamiento de la pelicula");
        this.setFechaLanzamiento(scan.nextInt());
        System.out.println("Escriba si la serie se incluye en el paquete basico");
        this.setIncluidoBasico(scan.nextBoolean());
        System.out.println("Escriba la duracion de la pelicula");
        this.setDuracion(scan.nextInt());

        System.out.println("Terminado con exito!, mostrando resultados");
        System.out.println("------------");

        this.menu();

        System.out.println("------------");
    }
}
