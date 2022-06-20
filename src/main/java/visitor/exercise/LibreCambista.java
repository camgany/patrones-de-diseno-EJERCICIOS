package visitor.exercise;

public class LibreCambista implements ILibreCambista {

    private String nombre;
    private int saldoMonedaPais;
    private int saldoDolares;

    public LibreCambista(String nombre) {
        this.nombre = nombre;

    }

    public void saldoEnDolares(int dolares) {

        saldoDolares += dolares;

    }

    public void saldoEnMonedaPais(int monedaPais) {

        saldoMonedaPais += monedaPais;

    }

    @Override


    public void visitarPais(ConcreteBolivia bolivia, EleccionDeCambio eleccionDeCambio) {
        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {
            System.out.println("El visitante: "+ nombre + " tiene " + saldoDolares + "dolares");
            System.out.println(" Su saldo en Bolivianos es " + String.format("%.2f", saldoDolares * 6.98) + "Bolivianos");


        } else {
            System.out.println("El visitante: "+ nombre + " tiene " + saldoMonedaPais + "Bolivianos");
            System.out.println(" Su saldo en Dolares es " + String.format("%.2f", saldoMonedaPais * 0.15) + "dolares");
        }




    }

    @Override
    public void visitarPais(ConcreteBrasil brasil, EleccionDeCambio eleccionDeCambio) {

        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {
            System.out.println("El visitante: "+ nombre + " tiene " + saldoDolares + "dolares");
            System.out.println(" Su saldo en Reales es " + String.format("%.2f", saldoDolares * 5.12) + "Reales");

        } else {
            System.out.println("El visitante: "+ nombre + " tiene " +  saldoMonedaPais + "Reales");
            System.out.println(" Su saldo en Dolares es " +  String.format("%.2f", saldoMonedaPais * 0.20) + "Dolares");
        }

    }

    @Override
    public void visitarPais(ConcreteArgentina argentina, EleccionDeCambio eleccionDeCambio) {

        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {
            System.out.println("El visitante: "+ nombre + " tiene " + saldoDolares + "dolares");
            System.out.println(" Su saldo en Pesos Argentinos es "  + String.format("%.2f", saldoDolares * 122.86) + "Pesos Argentinos");

        } else {
            System.out.println("El visitante: "+ nombre + " tiene " + saldoMonedaPais + "pesos Argentinos");
            System.out.println(" Su saldo en Dolares es "  + String.format("%.2f", saldoMonedaPais * 0.0081) + "Dolares");
        }

    }

    @Override
    public void visitarPais(ConcreteItalia italia, EleccionDeCambio eleccionDeCambio) {

        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {

            System.out.println("El visitante: "+ nombre + " tiene " + saldoDolares  + "Dolares");
            System.out.println(" Su saldo en Euros es "  +  String.format("%.2f", saldoDolares*0.95) + "Euros");


        } else {
            System.out.println("El visitante: "+ nombre + " tiene " + saldoMonedaPais + "Euros");
            System.out.println(" Su saldo en Dolares es "  +  String.format("%.2f", saldoMonedaPais*1.05) + "Dolares");

        }





    }

}