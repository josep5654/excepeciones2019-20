package primerosEjemplos;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Ejemplo de no declarativa, RuntimeException, NO se tratan
        //hacemos programación segura.
        int numerador = 3;
        int denominador = 0;
        double division1 = 1.0 * numerador / denominador;
        System.out.printf("Valor de la división: %.2f%n",division1);
        if (denominador != 0 ) {
            int division2 = numerador / denominador;
            System.out.printf("Valor de la división: %d%n", division2);
        } else {
            System.out.println("División por cero");
        }

        int [] valores = {1, 2, 3};
        int suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        double average = 1.0 * suma / valores.length;
        System.out.printf("Media: %.2f%n", average);
        int posicion = 3;
        if (valores.length > posicion)
            System.out.printf("Index %d del array: %d%n",
                    posicion, valores[posicion]);
        else
            System.out.printf("Index %d no existe%n", posicion);
        //Scanner sc = null; esto provoca el temido NullPointerException
        Scanner sc = new Scanner(System.in);
        //= new Scanner(System.in);
        System.out.println("Introduce un número");
        if (sc != null) {
          //  int number = sc.nextInt(); puede provocar error en la ejecución
            String  sNumero = sc.next();
            if (sNumero.matches("[0-9]+")) {
                int iNumero = Integer.parseInt(sNumero);
                System.out.printf("El valor doble de %d es %d%n", iNumero, iNumero * 2);
            } else {
                System.out.printf("%s no es un número%n", sNumero);
            }
            sc.close();
        } else {
            System.out.println("No se puede leer número");
        }
    }
}
