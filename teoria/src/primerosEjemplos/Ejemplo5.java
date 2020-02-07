package primerosEjemplos;

import java.util.Random;

public class Ejemplo5 {
    public static void main(String[] args) {
        int[] enteros = {0,1,2,3,4,5,6};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {

            int posicionAleatoria = random.nextInt(10);
            //se puede generar una excepcion no declarativa, RuntimeException, ArrayIndexOutOfBoundsException
           /* try {
                System.out.printf("Valor de la posición %d vale %d%n",
                        posicionAleatoria, enteros[posicionAleatoria]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.printf("No existe la posición %d%n", posicionAleatoria);
            }*/
            if (posicionAleatoria < enteros.length)
                System.out.printf("Valor de la posición %d vale %d%n",
                        posicionAleatoria, enteros[posicionAleatoria]);
            else
                System.out.printf("No existe la posición %d%n", posicionAleatoria);
        }
    }
}
