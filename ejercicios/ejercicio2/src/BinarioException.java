public class BinarioException extends Exception {
    @Override
    public String getMessage() {
        return "No es un número en binario";
    }
}
