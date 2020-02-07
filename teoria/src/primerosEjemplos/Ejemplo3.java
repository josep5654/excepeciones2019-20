package primerosEjemplos;

import java.io.*;
import java.util.Scanner;

public class Ejemplo3 {
    //excepciones declarativas, necesitan ser tratadas try-catch-finally
    public static void main(String[] args) {

        //anterior a Java 1.7
        InputStream inputStream0 = null;
        try {
             inputStream0 = new FileInputStream(
                    new File("ficheros/constitucion.txt"));
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("No existe el fichero");
        } finally {
            if (inputStream0 != null) {
                try {
                    inputStream0.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //Posterior a Java 1.7
        try (InputStream inputStream1 = new FileInputStream(
               new File("ficheros/constitucion.txt"));
             OutputStream outputStream = new FileOutputStream( //otro flujo closeable
                    new File("ficheros/copia.txt"));
             Scanner sc = new Scanner(System.in);  //no obliga try-cath, pero aquí se cierra solo
        ){
            //lectura del fichero
            int c;
            while ( ( c = inputStream1.read() ) != -1 )
                System.out.print((char) c);
            //escritura fichero
            //usaríamos el scanner
            //resto operaciones

        } catch (IOException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

    }
}
