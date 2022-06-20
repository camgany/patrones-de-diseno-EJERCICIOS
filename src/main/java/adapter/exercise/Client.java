package adapter.exercise;

public class Client {

    public static void main(String[] args) {

        IOriginal computadora = new Computadora(400, 24);
        computadora.precio();
        computadora.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IOriginal tablet = new Tablet(200, 12);
        tablet.precio();
        tablet.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IOriginal celular = new Celular(600, 4);
        celular.precio();
        celular.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        IOriginal televisor = new AdapterAdquiridos(new Televisor(400, 6));
        televisor.precio();
        televisor.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IOriginal lavadora = new AdapterAdquiridos(new Lavadora(1500, 36));
        lavadora.precio();
        lavadora.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IOriginal refrigerador = new AdapterAdquiridos(new Refrigerador(3500, 18));
        refrigerador.precio();
        refrigerador.tiempoDeVida();



    }

}