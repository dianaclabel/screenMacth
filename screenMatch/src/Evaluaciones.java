import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        while( nota != -1){
            System.out.println("Escribe la nota de la pelicula Matrix ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La media de evaluaciones para Matrix es : "+ mediaEvaluaciones/3);
    }
}
