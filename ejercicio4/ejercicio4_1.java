import java.util.Scanner;

public class ejercicio4_1 {
     
     static int numeros_fibonacci(int i){
    
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return (numeros_fibonacci(i - 1) + numeros_fibonacci(i - 2));
     }
    }
    
    
    
    
    

    public static void main(String args[]){

        Scanner lectura = new Scanner(System.in);
        System.out.println("Elige cuantos numeros de fibonacci quieres mostrar: ");
        int numero = lectura.nextInt();



    for(int i = 0; i<=numero - 1; i++){
    System.out.println(numeros_fibonacci(i));
}
    }
}
