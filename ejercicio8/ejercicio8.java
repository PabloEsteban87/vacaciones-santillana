import java.util.Scanner;

public class ejercicio8 {

    static void numerosAmigos(int numero1, int numero2) {
        int suma = 0;
        int suma2 = 0;
        int j = 0;
        int z = 0;
        int encontrado = 0;

        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                j = i;
                suma = suma + j;
            }
        }
        for (int a = 1; a < numero2; a++) {
            if (numero2 % a == 0) {
                z = a;
                suma2 = suma2 + z;
            }
        }

        if (numero1 == suma2 && numero2 == suma) {
            encontrado = 1;
        } else {
            encontrado = -1;
        }

        if (encontrado == 1) {
            System.out.println("Son amigos");
        }
        if (encontrado == -1) {
            System.out.println("No lo son");
        }

    }

    public static void main(String args[]) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ponga el primer numero: ");
        int numero1 = lectura.nextInt();
        System.out.println("Ponga el segundo numero: ");
        int numero2 = lectura.nextInt();

        numerosAmigos(numero1, numero2);

    }
}
