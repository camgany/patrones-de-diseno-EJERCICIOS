package primerParcial.singleton;


public class Ventanilla {
    private static  Ventanilla ventanilla;
    private static Cajero cajero;
    private int saldo;


    private Ventanilla(Cajero cajero){
        this.cajero = cajero;
        this.saldo = 0;
    }


    public static Ventanilla getInstance(Cajero cajero){
        if (ventanilla==null)
            ventanilla = new Ventanilla(cajero);

        return ventanilla;
    }

    public synchronized void pagar(int cantidad,Estudiante estudiante){
        System.out.println("------------------------------------------------------------------------------------");
        saldo=saldo+cantidad;
        System.out.println("Cantidad a pagar: "+cantidad + "Bs");
        System.out.println("Cajero: "+this.cajero.getNombre());
        System.out.println("Estudiante: "+estudiante.getNombre());
        getSaldo();

    }

    public Integer getSaldo(){

        System.out.println("Saldo total en ventanilla: "+this.saldo+"Bs");
        System.out.println("------------------------------------------------------------------------------------");
        return this.saldo;
    }

}