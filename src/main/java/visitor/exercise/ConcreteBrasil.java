package visitor.exercise;


public class ConcreteBrasil implements IPais {



    @Override
    public void visitadoPorLibreCambista(ILibreCambista libreCambista, EleccionDeCambio eleccionDeCambio) {

        libreCambista.visitarPais(this, eleccionDeCambio);

    }

}