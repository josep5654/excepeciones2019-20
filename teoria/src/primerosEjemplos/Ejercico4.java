package primerosEjemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Método que devuelve un objeto Scanner correspondiente a la lectura de un fichero
 * @param nombreFichero String representado el path del fichero
 * @retun devuelve el objeto Scanner
 * @throws  FileNotFoundException en caso de que no existe el fichero
 */

public class Ejercico4 {
    public static Scanner leerFicheroPorScanner (String nombreFichero)
            throws FileNotFoundException {
        String path = "ficheros/" + nombreFichero;
        Scanner sc = new Scanner(new File(path));
        return sc;
    }
}
