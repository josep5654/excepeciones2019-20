import java.util.ArrayList;
import java.util.List;

public class TestDigitos {
    public static void main(String[] args) {

        try {

            Hexadecimal hexadecimal = new Hexadecimal("ff");
            System.out.println(hexadecimal);
            Binario binario = new Binario("10a");
            System.out.println(binario);
        } catch (BinarioException | HexadecimalException e) {
            System.out.println("Formato no correcto");
        }

        List<Binario> listaBinario = new ArrayList<>();
        try {
            listaBinario.add(new Binario("00"));
            listaBinario.add(new Binario("01"));
            listaBinario.add(new Binario("10"));
        } catch (BinarioException e) {
            e.printStackTrace();
        }
        System.out.printf("La suma de los binarios vale %d%n",
                Binario.obtenerSumaDecimalListaBinarios(listaBinario));


        List<Hexadecimal> listaHexadecimal = new ArrayList<>();
        try {
            listaHexadecimal.add(new Hexadecimal("01")); // 1
            listaHexadecimal.add(new Hexadecimal("010")); // 16
            listaHexadecimal.add(new Hexadecimal("0a")); // 10
        } catch (HexadecimalException e) {
            e.printStackTrace();
        }

        System.out.printf("La suma de los hexadecimales vale %d%n",
                Hexadecimal.obtenerSumaDecimalListaHexadecimales(listaHexadecimal));

        System.out.println("Fin de programa");
    }
}
