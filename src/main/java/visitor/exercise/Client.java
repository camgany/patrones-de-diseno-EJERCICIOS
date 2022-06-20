package visitor.exercise;

public class Client {

    public static void main(String[] args) {

        LibreCambista libreCambista = new LibreCambista("Laura Bozzo");

        libreCambista.saldoEnDolares(50);
        libreCambista.saldoEnMonedaPais(255);

        ConcreteBolivia bolivia = new ConcreteBolivia();
        ConcreteBrasil brasil = new ConcreteBrasil();
        ConcreteArgentina argentina = new ConcreteArgentina();
        ConcreteItalia italia = new ConcreteItalia();

        bolivia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);
        brasil.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);
        argentina.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);
        italia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);

        bolivia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);
        brasil.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);
        argentina.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);
        italia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);




    }

}