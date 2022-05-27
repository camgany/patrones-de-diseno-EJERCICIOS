package primerParcial.interpreter;

public class Client {
    public static void main (String[]args){

        String operacion=" Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

        NonTerminalExpression interpreterUserStory = new NonTerminalExpression(operacion);
        System.out.println("Story User Al Comienzo: "+operacion);
        System.out.println("Story User Al Salir: "+interpreterUserStory.interpreta());


    }
}
