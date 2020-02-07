public class Hexadecimal {
    private String valor;  // 00111 10001 100 10001

    public Hexadecimal(String valor) {
        this.valor = valor;
    }
    public int devolverValorDecimal(){
       /* double suma = 0.0;
        StringBuilder sB = new StringBuilder(valor.toLowerCase()); //para poder acceder al reverse
        sB.reverse();  //StringBuilder es mutable, cambia
        String valorReverse = sB.toString(); //volver obtenerlo como String
        for (int i = 0; i < valorReverse.length()  ; i++) {*/
           /* if (Character.isDigit(valorReverse.charAt(i)))
                suma += Math.pow(16, i) * (valorReverse.charAt(i) - 48);
            else
                suma += Math.pow(16, i) * (valorReverse.charAt(i) - 87);*/
         /*   switch (valorReverse.charAt(i)){
                case 'a':
                    suma += Math.pow(16, i) * 10;
                    break;
                case 'b':
                    suma += Math.pow(16, i) * 11;
                    break;
                case 'c':
                    suma += Math.pow(16, i) * 12;
                    break;
                case 'd':
                    suma += Math.pow(16, i) * 13;
                    break;
                case 'e':
                    suma += Math.pow(16, i) * 14;
                    break;
                case 'f':
                    suma += Math.pow(16, i) * 15;
                    break;
                default:
                    suma += Math.pow(16,i) * Integer.parseInt(valorReverse.charAt(i) + "");
                    break;
            }
        }
        return (int) suma; */
        return Integer.parseInt(valor, 16);

    }

    @Override
    public String toString() {
        return valor + ": " + devolverValorDecimal();  // 01: 2  011: 3
    }
}
