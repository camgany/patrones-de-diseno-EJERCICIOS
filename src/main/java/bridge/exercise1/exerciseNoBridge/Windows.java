package bridge.exercise1.exerciseNoBridge;

public class Windows implements IArquitectura{

    @Override
    public void tipoSO() {
        System.out.println("SO Windows");
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