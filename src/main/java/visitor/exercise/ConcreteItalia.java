package visitor.exercise;

public class ConcreteItalia implements IPais{


    @Override
    public void visitadoPorLibreCambista(ILibreCambista libreCambista, EleccionDeCambio eleccionDeCambio) {

        libreCambista.visitarPais(this, eleccionDeCambio);

    }
}