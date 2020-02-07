package primerosEjemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args)  {
        //Ejemplo de declarativas
        Scanner  sc = null;
        try {
            sc = new Scanner(new File(
                    "ficheros/constitucin.txt"));
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("Fichero no encontrado\n" + e.getMessage() );
        } finally {

            if (sc != null){
                System.out.println("Cerrano el scanner");
                sc.close();
            } else {
                System.out.println("No se ha abierto el scanner");
            }

        }
        System.out.println("Fin de programa");
    }
}
