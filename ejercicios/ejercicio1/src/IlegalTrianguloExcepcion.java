public class IlegalTrianguloExcepcion extends Exception{
    @Override
    public String getMessage() {
        return "No es un triángulo";
    }
}
