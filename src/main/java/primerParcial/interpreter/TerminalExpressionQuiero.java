package primerParcial.interpreter;

public class TerminalExpressionQuiero extends AbstractExpression{
    public TerminalExpressionQuiero (int cantidad){
        this.cantidadPalabra = cantidad;

    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){//quitamos la palabra
            //lo llevamos al output la palabra que estamoa borrando del  input
            context.input= context.input.substring(1);
        }
        if (context.input.startsWith("Quiero")){
            context.output= context.output+"When ";
            context.input= context.input.substring(cantidadPalabra);
        }
    }
}
