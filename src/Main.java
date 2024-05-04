import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersión Java!");
        //System.out.println("Pelicula Se levanta el viento");

        //Declaración de variables
        int fechaDeLanzamiento = 2013;
        double evaluacion = 4.8;
        boolean incluidoEnElPlanBasico = true;
        double mediaEvaluacionUsuario = 0;

        String nombre = "Se levanta el viento";
        String sinopsis = """
                Historia de un romance en medio de la segunda guerra mundial en Japón.         
                """;
        System.out.println("Pelicula: "+nombre);
        System.out.println("Sinopsis: "+sinopsis);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Calificación: "+evaluacion);
        System.out.println("Incluido en plan estándar: "+incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.8 + 4.5 + 4.0) / 3;
        System.out.println("La calificación media de "+nombre+" es: "+mediaEvaluacion);

        if (fechaDeLanzamiento >= 2024) {
            System.out.println("Pelicula reciente!");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a la pelicula "+nombre+": ");
            double nota = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + nota;
        }
        System.out.println("La nota media de la pelicula "+nombre+" es: "+mediaEvaluacionUsuario / 3);
    }
}


