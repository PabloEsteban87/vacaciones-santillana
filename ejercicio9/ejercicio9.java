import java.util.Scanner;
import java.lang.String;

public class ejercicio9 {

    static void arrayDuplicados(int numero1, int numero2, int numero3, int numero4, int numero5) {
        int[] arrayEnteros = new int[5];
        arrayEnteros[0] = numero1;
        arrayEnteros[1] = numero2;
        arrayEnteros[2] = numero3;
        arrayEnteros[3] = numero4;
        arrayEnteros[4] = numero5;
        int contar1 = 0;
        int contar2 = 0;
        int contar3 = 0;
        int contar4 = 0;
        int contar5 = 0;

        int guardarnumero1 = 0;
        int guardarnumero2 = 0;
        int guardarnumero3 = 0;
        int guardarnumero4 = 0;
        int guardarnumero5 = 0;

        for (int i = 0; i <= arrayEnteros.length - 1; i++) {

            /*
             * String duplicado = String.valueOf(arrayEnteros);
             * System.out.println(duplicado);
             */
            /* boolean comprobacion = duplicado.equals(numero1.toString()); */

            if (arrayEnteros[i] == numero1) {
                contar1++;
                guardarnumero1 = numero1;
            } else if (arrayEnteros[i] == numero2) {
                contar2++;
                guardarnumero2 = numero2;
            } else if (arrayEnteros[i] == numero3) {
                contar3++;
                guardarnumero3 = numero3;
            } else if (arrayEnteros[i] == numero4) {
                contar4++;
                guardarnumero4 = numero4;

            } else {
                contar5++;
                guardarnumero5 = numero5;
            }

        }
        if (contar1 > 1) {
            System.out.println("El número " + guardarnumero1 + " se repite: " + contar1 + " veces");
        }
        if (contar2 > 1) {
            System.out.println("El número " + guardarnumero2 + " se repite: " + contar2 + " veces");
        }
        if (contar3 > 1) {
            System.out.println("El número " + guardarnumero3 + " se repite: " + contar3 + " veces");

        }
        if (contar4 > 1) {
            System.out.println("El número " + guardarnumero4 + " se repite: " + contar4 + " veces");
        }
        if (contar5 > 1) {
            System.out.println("El número " + guardarnumero5 + " se repite: " + contar5 + " veces");
        }
    }

    public static void main(String args[]) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ponga el primer numero: ");
        int numero1 = lectura.nextInt();
        System.out.println("Ponga el segundo numero: ");
        int numero2 = lectura.nextInt();
        System.out.println("Ponga el tercer numero: ");
        int numero3 = lectura.nextInt();
        System.out.println("Ponga el cuarto numero: ");
        int numero4 = lectura.nextInt();
        System.out.println("Ponga el quinto numero: ");
        int numero5 = lectura.nextInt();

        arrayDuplicados(numero1, numero2, numero3, numero4, numero5);

    }
}
