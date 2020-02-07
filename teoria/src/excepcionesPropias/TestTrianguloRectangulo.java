package excepcionesPropias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTrianguloRectangulo {
    public static void main(String[] args)  {
        List<TrianguloRectangulo> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (TrianguloRectangulo.getNumeroTriangulosRectangulos() < 2) {
            try {
                System.out.println("Introduce valor cateto1");
                float cateto1 = sc.nextFloat();
                System.out.println("Introduce valor cateto2");
                float cateto2 = sc.nextFloat();
                System.out.println("Introduce valor hipotenusa");
                float hipotenusa = sc.nextFloat();
                TrianguloRectangulo trianguloRectangulo =
                        new TrianguloRectangulo(cateto1, cateto2, hipotenusa);
                System.out.println(trianguloRectangulo);
                System.out.printf("Su perímetro vale %.2f%n",
                        trianguloRectangulo.calcularPerimetro());
                lista.add(trianguloRectangulo);
             } catch (TrianguloRectanguloException e) {
                System.out.println(e.getMessage());
             } finally {
                System.out.printf("Creados %d triángulos rectángulos%n",
                        TrianguloRectangulo.getNumeroTriangulosRectangulos());

             }


        }
        sc.close();
        System.out.println("Lista: \n" + lista);

        System.out.printf("Triángulo mas grande%n%s%n",
               TrianguloRectangulo.obtenerTrianguloMayorHipotenusa(lista));
    }
}
