
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Pelicula Matrix");

        int launch = 1999;
        double score = 4.5;
        boolean includeInBasicPlan = true;

        System.out.println(launch);
        System.out.println(score);
        System.out.println(includeInBasicPlan);
        //Ojito
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(score);
        double userScore;
        printScores(scores);
        String name = "Matrix";
        String sinopsis = """
                Grande el matrix
                """;

        System.out.println("Del 1 al 10 que calificación das a Matrix");

        userScore = rate();

        scores.add(userScore);

        System.out.println("Las calificaciones son:");
        printScores(scores);
        System.out.println("La calificación promedio es");
        printAverageScores(scores);
    }

    private static double rate() {
        double userScore = -1;
        try(Scanner scan = new Scanner(System.in)) {
            userScore = scan.nextDouble();
        }
        catch (Exception ignore) {
        }
        return userScore;
    }
    public static void printAverageScores(ArrayList<Double> array) {
        double total = 0;
        for (Double score : array) {
            double tmp = score;
            total += tmp;
        }

        double result = total / array.size();

        System.out.println(result);
    }
    public static void printScores(ArrayList<Double> array) {
        array.forEach(System.out::println);
    }
}