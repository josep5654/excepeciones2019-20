import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDigitosFichero {
    public static void main(String[] args) {
      /*  Scanner sc = null;
        try {
            sc = new Scanner(new File(
                    "ficheros/hexadecimal.tx"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null){
                System.out.println("Cerrando scanner");
                sc.close();
            }

        }*/
        //cierre automático del Scanner
        List<Hexadecimal> listaHexadecimal = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(
                "ficheros/hexadecimal.txt"));)
        {

            while (sc.hasNextLine()) {
                String numero = null;
               // System.out.println("Token : " + );
                try {
                     numero = sc.nextLine();
                    listaHexadecimal.add(new Hexadecimal(numero));
                } catch (HexadecimalException e) {
                    System.out.println(numero + " :" + e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //System.out.println(listaHexadecimal);
        System.out.printf("La suma de todos los valores hexadecimales, " +
                "en decimal vale %d%n", Hexadecimal.obtenerSumaDecimalListaHexadecimales(
                        listaHexadecimal));
    }
}
