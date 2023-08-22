public class ejercicio10 {

    static int duplicado = 0; 

    static int[] arrayEnteros1(int numero1, int numero2, int numero3, int numero4, int numero5) {
        int[] arrayEnteros = new int[5];
        arrayEnteros[0] = numero1;
        arrayEnteros[1] = numero2;
        arrayEnteros[2] = numero3;
        arrayEnteros[3] = numero4;
        arrayEnteros[4] = numero5;
        return arrayEnteros;
    }

      static int[] arrayEnteros2(int numero1, int numero2, int numero3, int numero4, int numero5) {
        int[] arrayEnteros2 = new int[5];
        arrayEnteros2[0] = numero1;
        arrayEnteros2[1] = numero2;
        arrayEnteros2[2] = numero3;
        arrayEnteros2[3] = numero4;
        arrayEnteros2[4] = numero5;
        return arrayEnteros2;
    }   

    static void arraysDuplicados(int [] arrayEnteros1, int [] arrayEnteros2){
        for(int i= 0; i<= arrayEnteros1.length - 1; i++){
            for (int j = 0; j<= arrayEnteros2.length - 1; j++){
                if(arrayEnteros1[i] == arrayEnteros2[j]){
                    System.out.println("Estos numeros están duplicados: " + arrayEnteros1[i]);
                }
            }
        }
        
    }



    public static void main(String args[]) {

        int[] arrayEnteros1 = arrayEnteros1(1, 2, 3, 4, 5);
        int[] arrayEnteros2 = arrayEnteros2(2, 7, 1, 8, 9);
        arraysDuplicados(arrayEnteros1, arrayEnteros2);

    }
}
