package primerParcial.interpreter;

public class TerminalExpressionPara extends AbstractExpression{
    public TerminalExpressionPara (int cantidad){
        this.cantidadPalabra = cantidad;

    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){//quitamos la palabra
            //lo llevamos al output la palabra que estamoa borrando del  input
            context.input= context.input.substring(1);
        }
        if (context.input.startsWith("Para")){
            context.output= context.output+"Then ";
            context.input= context.input.substring(cantidadPalabra);
        }
    }
}
