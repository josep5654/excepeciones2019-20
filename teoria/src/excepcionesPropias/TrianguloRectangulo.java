package excepcionesPropias;

import java.util.List;

public class TrianguloRectangulo {
    //atributos
    private float cateto1;
    private float cateto2;
    private float hipotenusa;
    private static int numeroTriangulosRectangulos = 0;

    public TrianguloRectangulo(float cateto1, float cateto2, float hipotenusa)
            throws TrianguloRectanguloException {
        if (esTriangulRectangulo( cateto1, cateto2, hipotenusa)) {
            this.cateto1 = cateto1;
            this.cateto2 = cateto2;
            this.hipotenusa = hipotenusa;
            numeroTriangulosRectangulos++;
        }
        else
            throw new TrianguloRectanguloException();
    }

    public static int getNumeroTriangulosRectangulos() {
        return numeroTriangulosRectangulos ;
    }

    private boolean esTriangulRectangulo(float cateto1, float cateto2, float hipotenusa) {
        return hipotenusa * hipotenusa == cateto1 * cateto1 + cateto2 * cateto2;
    }
    public float calcularPerimetro ()
    {
        return cateto1 + cateto2 + hipotenusa;
    }

    public static TrianguloRectangulo obtenerTrianguloMayorHipotenusa
            (List<TrianguloRectangulo> listaTriangulosRectangulos){
        float hipotenusaMasGrande = Float.MIN_VALUE;
        TrianguloRectangulo trianguloHipGrande = null;
        for (TrianguloRectangulo t: listaTriangulosRectangulos) {
            if (t.hipotenusa > hipotenusaMasGrande){
                hipotenusaMasGrande = t.hipotenusa;
                trianguloHipGrande = t;
            }

        }
        return trianguloHipGrande;
    }
    @Override
    public String toString() {
        return "TrianguloRectangulo{" +
                "cateto1=" + cateto1 +
                ", cateto2=" + cateto2 +
                ", hipotenusa=" + hipotenusa +
                '}';
    }
}
