package bridge.exercise1.exerciseBridge;

public class Client {
    public static void main (String[]args) {
        ITipo arquix86 = new Arqui86();
        ITipo arquix64 = new Arqui64();


        Linux linux = new Linux(arquix64);
        linux.tipoSO();
        linux.showArqui();

        Windows windows = new Windows(arquix86);
        windows.tipoSO();
        windows.showArqui();
    }
}
