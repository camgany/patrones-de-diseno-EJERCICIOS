package adapter.exercise;

public class AdapterAdquiridos implements IOriginal {

    private IAdquiridos artefactosAdquiridos;

    public AdapterAdquiridos(IAdquiridos artefactosAdquiridos) {
        this.artefactosAdquiridos = artefactosAdquiridos;
    }

    public IAdquiridos getArtefactosAdquiridos() {
        return artefactosAdquiridos;
    }

    public void setArtefactosAdquiridos(IAdquiridos artefactosAdquiridos) {
        this.artefactosAdquiridos = artefactosAdquiridos;
    }

    @Override
    public void precio() {

        artefactosAdquiridos.costo();

    }

    @Override
    public void tiempoDeVida() {

        artefactosAdquiridos.tiempoDeGarantia();

    }
}