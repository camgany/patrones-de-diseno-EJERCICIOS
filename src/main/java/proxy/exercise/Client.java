package proxy.exercise;


public class Client {

    public static void main (String []args){

        ICuentaBancaria compras = new CuentaBancariaProxy("Maria",1000);
        Compra compra1 = new Compra("AUDIFONOS","ARTICULO TECNOLOGICO",10,"Dolares");
        Compra compra2 = new Compra("CELULAR", "ARTICULO TECNOLOGICO",100,"Bolivianos");
        Compra compra3 = new Compra("OREO", "GALLETAS",255555,"Pesos colombianos");
        Compra compra4 = new Compra("NUTELLA", "CHOCOLATE",2000,"Bolivianos");
        compras.request(compra1);
        compras.request(compra2);
        compras.request(compra3);
        compras.request(compra4);



    }

}