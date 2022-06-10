package strategy.practice;

public class Client {
    public static void main (String[]args){
        Tienda context = new Tienda("Bershka");
        context.addRopa(new Ropa("Top",100));
        context.addRopa(new Ropa("Falda",50));
        context.addRopa(new Ropa("Blazer",200));
        context.setStrategy(new EstacionOtono());
        context.execute();
        context.setStrategy(new EstacionInvierno());
        context.execute();
    }

}