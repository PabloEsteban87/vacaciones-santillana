import java.util.Scanner;

public class ejercicio6 {

    static int contarDigitos(int numero) {
        String digitosCadena = String.valueOf(numero);
        int digitos = digitosCadena.length();
        return digitos;
    }

    public static void main(String args[]) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ponga un número para saber los digitos: ");
        int numero = lectura.nextInt();

        System.out.println(contarDigitos(numero));

    }
}
