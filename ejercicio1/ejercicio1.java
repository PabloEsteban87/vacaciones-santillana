import java.util.Scanner;

public class ejercicio1{

public static void main (String[] args){

Scanner lectura = new Scanner (System.in);

System.out.println("Ingrese un mes: ");

String mes = lectura.next();

switch (mes){
    case "1":
    System.out.println("el mes es: enero y sus dias son: 31");
    break;

    case "2":
    System.out.println("el mes es: febrero y sus dias son: 28");
    break;

    case "3":
    System.out.println("el mes es: marzo y sus dias son: 31");
    break;

    case "4":
    System.out.println("el mes es: abril y sus dias son: 30");
    break;

    case "5":
    System.out.println("el mes es: mayo y sus dias son: 31");
    break;

    case "6":
    System.out.println("el mes es: junio y sus dias son: 30");
    break;

    case "7":
    System.out.println("el mes es: julio y sus dias son: 31");
    break;

    case "8":
    System.out.println("el mes es: agosto y sus dias son: 31");
    break;

    case "9":
    System.out.println("el mes es: septiembre y sus dias son: 30");
    break;

    case "10":
    System.out.println("el mes es: octubre y sus dias son: 31");
    break;

    case "11":
    System.out.println("el mes es: noviembre y sus dias son: 30");
    break;

    case "12":
    System.out.println("el mes es: diciembre y sus dias son: 31");
    break;
}
}
}