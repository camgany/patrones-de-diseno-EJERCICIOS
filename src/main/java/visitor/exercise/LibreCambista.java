package visitor.exercise;

public class LibreCambista implements ILibreCambista {

    private String nombre;
    private int saldoMonedaPais;
    private int saldoDolares;

    public LibreCambista(String nombre) {
        this.nombre = nombre;

    }

    public void darDolares(int dolares) {

        saldoDolares += dolares;

    }

    public void darMonedaPais(int monedaPais) {

        saldoMonedaPais += monedaPais;

    }

    @Override


    public void visitarPais(ConcreteBolivia bolivia, EleccionDeCambio eleccionDeCambio) {

        System.out.println(nombre + " está visitando Bolivia!");
        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {
            System.out.println(nombre + " cuenta con " + saldoDolares + "$");
            System.out.println("Como un dolar en bolivianos son 6.88 Bs... ");
            System.out.println(saldoDolares + "$" + " en bolivianos son: " + String.format("%.2f", saldoDolares * 6.88) + "Bs.");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


        } else {
            System.out.println(nombre + " cuenta con " + saldoMonedaPais + "Bs.");
            System.out.println("Como un boliviano en dolares son 0.15$...");
            System.out.println(saldoMonedaPais + " Bs." + "en dolares son: " + String.format("%.2f", saldoMonedaPais * 0.15) + "$");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        }




    }

    @Override
    public void visitarPais(ConcreteBrasil brasil, EleccionDeCambio eleccionDeCambio) {

        System.out.println(nombre + " está visitando Brasil!");
        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {
            System.out.println(nombre + " cuenta con " + saldoDolares + "$");
            System.out.println("Como un dolar en reales brasileños son 5.12 R$... ");
            System.out.println(saldoDolares + "$" + " en reales brasileños son: " + String.format("%.2f", saldoDolares * 5.12) + "R$");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        } else {
            System.out.println(nombre + " cuenta con " + saldoMonedaPais + "R$");
            System.out.println("Como un real brasileño en dolares son 0.20$...");
            System.out.println(saldoMonedaPais + " R$" + "en dolares son: " + String.format("%.2f", saldoMonedaPais * 0.20) + "$");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        }

    }

    @Override
    public void visitarPais(ConcreteArgentina argentina, EleccionDeCambio eleccionDeCambio) {

        System.out.println(nombre + " está visitando Argentina!");
        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {
            System.out.println(nombre + " cuenta con " + saldoDolares + "$");
            System.out.println("Como un dolar en pesos argentinos son 122.86$... ");
            System.out.println(saldoDolares + "$" + " en pesos argentinos son: " + String.format("%.2f", saldoDolares * 122.86) + "$");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        } else {
            System.out.println(nombre + " cuenta con " + saldoMonedaPais + "$");
            System.out.println("Como un peso argentino en dolares son 0.0081$...");
            System.out.println(saldoMonedaPais + " $" + "en dolares son: " + String.format("%.2f", saldoMonedaPais * 0.0081) + "$");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        }

    }

    @Override
    public void visitarPais(ConcreteItalia italia, EleccionDeCambio eleccionDeCambio) {

        System.out.println(nombre + " está visitando Italia!");

        if(eleccionDeCambio.equals(EleccionDeCambio.DOLARALOCAL)) {

            System.out.println(nombre + " cuenta con " + saldoDolares  + "$");
            System.out.println("Como un dolar en euros son 0.95€... " );
            System.out.println(saldoDolares + "$" + " en euros son: " + String.format("%.2f", saldoDolares*0.95) + "€");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


        } else {
            System.out.println(nombre + " cuenta con " + saldoMonedaPais + "€");
            System.out.println("Como un euro en dolares son 1.05$...");
            System.out.println(saldoMonedaPais + " €" + "en dolares son: " + String.format("%.2f", saldoMonedaPais*1.05) + "$");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        }





    }

}