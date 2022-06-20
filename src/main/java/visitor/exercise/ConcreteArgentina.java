package visitor.exercise;

public class ConcreteArgentina implements IPais{


    @Override
    public void visitadoPorLibreCambista(ILibreCambista libreCambista, EleccionDeCambio eleccionDeCambio) {

        libreCambista.visitarPais(this, eleccionDeCambio);

    }
}