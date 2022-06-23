package bridge.exercise1.exerciseBridge;

public class Windows implements IArquitactura {
    private ITipo tipo;

    public Windows(ITipo tipo) {
        this.tipo = tipo;
    }

    public void showArqui(){
        tipo.arquitectura();
    }

    @Override
    public void tipoSO() {
        System.out.println("Sistema Operativo Windows");
    }
}
