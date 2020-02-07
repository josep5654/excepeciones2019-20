public class Binario {
    private String valor;  // 00111 10001 100 10001

    public Binario(String valor) {
        this.valor = valor;
    }
    public int devolverValorDecimal(){
        double suma = 0.0;
        StringBuilder sB = new StringBuilder(valor); //para poder acceder al reverse
        sB.reverse();  //StringBuilder es mutable, cambia
        String valorReverse = sB.toString(); //volver obtenerlo como String
        for (int i = 0; i < valorReverse.length()  ; i++) {
            suma += Math.pow(2,i) * Integer.parseInt(valorReverse.charAt(i) + "");
        }
        return (int) suma;

    }

    @Override
    public String toString() {
        return valor + ": " + devolverValorDecimal();  // 01: 2  011: 3
    }
}











