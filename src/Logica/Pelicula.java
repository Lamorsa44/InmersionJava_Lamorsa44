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
        System.out.println("Duración: " + getDuracion());
    }

    @Override
    public void llenar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba el titulo de la película");
        this.setTitulo(scan.nextLine());
        System.out.println("Escriba la sinopsis de la película");
        this.setSinopsis(scan.nextLine());
        System.out.println("Escriba la valoración de la película");
        this.setValoracion(scan.nextDouble());
        System.out.println("Escriba la fecha de lanzamiento de la película");
        this.setFechaLanzamiento(scan.nextInt());
        System.out.println("Escriba si la película se incluye en el paquete basico");
        this.setIncluidoBasico(scan.nextBoolean());
        System.out.println("Escriba la duración de la película");
        this.setDuracion(scan.nextInt());

        System.out.println("Terminado con exito!, mostrando resultados");
        System.out.println("------------");

        this.menu();

        System.out.println("------------");
    }
}
