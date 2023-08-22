import java.util.Scanner;

public class ejercicio5 {

    static void numeros_perfectos(int numero) {
        int suma = 0;
        int j = 0;
        int encontrado = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                j = i;
                suma = suma + j;
            } else if (numero == suma) {
                encontrado = 1;
            } else {
                encontrado = -1;
            }
        }

        if (encontrado == 1) {
            System.out.println("Es un numero perfecto");
        }
        if (encontrado == -1) {
            System.out.println("No lo es");
        }
    }

    public static void main(String args[]) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ponga un número: ");
        int numero = lectura.nextInt();

        numeros_perfectos(numero);

    }
}
