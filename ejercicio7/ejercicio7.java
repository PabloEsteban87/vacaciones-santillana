import java.util.Scanner;

public class ejercicio7 {

    static String calcularNotas(Double nota1, Double nota2, Double nota3, Double nota4, Double nota5) {
        Double[] notas = new Double[5];
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        notas[3] = nota4;
        notas[4] = nota5;
        int j = 0;
        for (int i = 0; i <= notas.length - 1; i++) {
            if (notas[i] >= 3.0) {
                j++;
            }
        }
        return "Las notas mayores a 3.0 fueron: " + j;
    }

    public static void main(String args[]) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ponga la primera nota: ");
        Double nota1 = lectura.nextDouble();
        System.out.println("Ponga la segunda nota: ");
        Double nota2 = lectura.nextDouble();
        System.out.println("Ponga la tercera nota: ");
        Double nota3 = lectura.nextDouble();
        System.out.println("Ponga la cuarta nota: ");
        Double nota4 = lectura.nextDouble();
        System.out.println("Ponga la quinta nota: ");
        Double nota5 = lectura.nextDouble();

        System.out.println(calcularNotas(nota1, nota2, nota3, nota4, nota5));

    }
}
