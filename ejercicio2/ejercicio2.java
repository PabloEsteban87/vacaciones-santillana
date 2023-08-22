import java.util.Scanner;

public class ejercicio2{

public static void main (String[] args){

Scanner lectura = new Scanner (System.in);

System.out.println("Ingrese un año: ");

String bisiesto = lectura.next();
int bisiesto_2 = Integer.parseInt(bisiesto);

if((bisiesto_2 % 4 == 0) && (bisiesto_2 % 100 != 0 || bisiesto_2 % 400 == 0)){
    System.out.println("el año es bisiesto");
}
else{
    System.out.println("el año no es bisiesto");
}
}
}