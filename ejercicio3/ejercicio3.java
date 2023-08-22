import java.util.Scanner;

public class ejercicio3{

public static void main (String[] args){

Scanner lectura = new Scanner (System.in);
System.out.println("Ingrese un numero: ");

String numero = lectura.next();
double resultado = 0;
double numero_double = Double.parseDouble(numero);
String numero1 = String.valueOf(numero);
String[] numeros = numero1.split("(?<=.)");
double[] arrayDouble = new double[numeros.length];

for(int i = 0; i < arrayDouble.length; i++) {
    arrayDouble[i] = Double.parseDouble(numeros[i]);
    resultado += Math.pow(arrayDouble[i], arrayDouble.length);
}

if(resultado == numero_double){
 System.out.println("es un número de Amstrong");
     }
    else{
    System.out.println("No lo es");
    }
}
}
