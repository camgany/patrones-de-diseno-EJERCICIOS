package bridge.exercise1.exerciseNoBridge;

public class Linux implements IArquitectura{

    @Override
    public void tipoSO() {
        System.out.println("SO Linux");
    }

    @Override
    public void arq64() {
        System.out.println("Arquitectura x 64");
    }

    @Override
    public void arq86() {
        System.out.println("Arquitectura x 86");
    }
}
