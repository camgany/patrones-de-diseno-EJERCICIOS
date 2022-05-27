package primerParcial.builder;

public class Client {
    public static void main(String[] args) {
        Restaurant saborGaucho = new Restaurant();
        BuilderParrilla bife = new Bife();
        BuilderParrilla lomo = new Lomito();
        BuilderParrilla tira = new Tira();

        OrdenCliente mario = new OrdenCliente("Mario Ruiz",355675);
        System.out.println("ORDEN ");
        System.out.println("Cliente: "+mario.getNombre() + " "+ "NIT: "+mario.getNit());
        mario.hacerPedido(bife,saborGaucho);
        mario.hacerPedido(lomo,saborGaucho);
        mario.hacerPedido(tira,saborGaucho);

        //saborGaucho.setBuilder(lomo);
        //saborGaucho.hacerParrilla();
        //Parrilla parrilla2 = saborGaucho.getParrillaHecha();
        //parrilla2.showInfo();
//
        //saborGaucho.setBuilder(tira);
        //saborGaucho.hacerParrilla();
        //Parrilla parrilla3 = saborGaucho.getParrillaHecha();
        //parrilla3.showInfo();

    }
}
