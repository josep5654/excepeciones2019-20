public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int a, int b, int c) throws IlegalTrianguloExcepcion {
        if (comprobarDesigualdadTriangular(a, b, c)) {
            this.lado1 = a;
            this.lado2 = b;
            this.lado3 = c;
        } else  {
            throw new IlegalTrianguloExcepcion();
        }
    }

    private boolean comprobarDesigualdadTriangular(int a, int b, int c) {
        return a + b > c && a + c > b && c + b >a;
    }

    @Override
    public String toString() {
        return "Triangulo: " +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 ;
    }
}
