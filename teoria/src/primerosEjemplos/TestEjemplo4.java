package primerosEjemplos;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestEjemplo4 {
    public static void main(String[] args) {
        try {
            int contadorLineas = 0;
            Scanner sc = Ejercico4.leerFicheroPorScanner("constitucion.txt");
            while (sc.hasNextLine()) {
                contadorLineas++;
                System.out.println("leido");
            }
            System.out.printf("El fichero tiene %d palabras%n", contadorLineas);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
