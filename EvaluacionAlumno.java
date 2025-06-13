import java.util.Scanner;

public class EvaluacionAlumno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingreso de notas
        System.out.print("Ingrese la primera nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = input.nextDouble();

        // Cálculo del promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Evaluación con un solo if
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        input.close();
    }
}
