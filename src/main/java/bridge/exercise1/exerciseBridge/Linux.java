package bridge.exercise1.exerciseBridge;



public class Linux implements IArquitactura {
    private ITipo tipo;

    public Linux(ITipo tipo) {
        this.tipo = tipo;
    }

    public void showArqui(){
        tipo.arquitectura();
    }
    @Override
    public void tipoSO() {
        System.out.println("Sistema Operativo Linux");
    }
}
