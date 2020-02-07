package excepcionesPropias;

public class TrianguloRectanguloException  extends  Exception{
    @Override
    public String getMessage() {
        return "No es un triángulo rectángulo";
    }
}
