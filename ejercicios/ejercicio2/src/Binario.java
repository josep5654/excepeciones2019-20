import java.util.List;

public class Binario {

    private String valor;  // 00111 10001 100 10001

    public Binario(String valor) throws BinarioException {
        if ( esBinario(valor) )
            this.valor = valor;
        else
            throw new BinarioException();
    }

    private boolean esBinario(String valor) {
        return valor.matches("[01]+");
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

        //return Integer.parseInt(valor, 2);

    }

    @Override
    public String toString() {
        return "Binario: " + valor +  ", Decimal: " + devolverValorDecimal();  // 01: 2  011: 3
    }

    public static int obtenerSumaDecimalListaBinarios(
            List<Binario> lista ) {
        int suma = 0;
        for ( Binario b: lista ) {
            suma += b.devolverValorDecimal();
        }
        return suma;
    }
    public static Binario convertirDecimalABinario(int valor) {
        Binario binario = null;
        StringBuilder sBuilder = new StringBuilder();
        int cociente = valor / 2 ;
        int resto    = valor % 2 ;
        sBuilder.append(resto);
        while ( cociente > 1 ){
            resto    = cociente % 2;
            sBuilder.append(resto);
            cociente = cociente / 2;
        }
        if (valor > 2)
            sBuilder.append(1);
        sBuilder.reverse();
        try {
            binario = new Binario(sBuilder.toString());
        } catch (BinarioException e) {
            e.printStackTrace();
        }
        return binario;
    }
}











