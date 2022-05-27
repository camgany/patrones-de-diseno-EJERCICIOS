package primerParcial.interpreter;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends AbstractExpression{
    private List<AbstractExpression> grammar = new ArrayList<>();
    private Context context;
    public NonTerminalExpression(String palabra){
        // asegurando que el msg original no tenga espacios - regla gramatica
        //dividos las palabras por los espacios
        this.interpretar(palabra);

    }

   public void interpretar(String palabras){
        String input = palabras;
        context = new Context(input);
       for ( String palabra :  input.split(" ")) {
           switch (palabra){
               case "Como":
                   grammar.add(new TerminalExpressionComo(palabra.length()));
                   break;
               case "Quiero":
                   grammar.add(new TerminalExpressionQuiero(palabra.length()));
                   break;
               case "Para":
                   grammar.add(new TerminalExpressionPara(palabra.length()));
                   break;
               default:
                   grammar.add(new TerminalExpressionNormal(palabra.length()));
                   break;


           }
       }
   }

   public String interpreta(){
        for(AbstractExpression terminalExpression: grammar){
            terminalExpression.interpreter(context);
        }
        return context.output;
   }
    @Override
    public void interpreter(Context context) {

    }
}
