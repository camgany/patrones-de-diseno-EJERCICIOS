package primerParcial.interpreter;

public class TerminalExpressionNormal extends AbstractExpression{
    public TerminalExpressionNormal(int cantidad){
        this.cantidadPalabra = cantidad;

    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){//quitamos la palabra
            //lo llevamos al output la palabra que estamoa borrando del  input
            context.input= context.input.substring(1);
        }

        context.output = context.output + context.input.substring(0,this.cantidadPalabra)+ " ";
        //borramos al input
        context.input = context.input.substring(this.cantidadPalabra);
    }
}
