package primerParcial.interpreter;

public abstract class AbstractExpression {
    protected int cantidadPalabra;

    public abstract void interpreter(Context context);
}
