package bridge.exercise1.exerciseNoBridge;

public class Client {
    public static void main (String[]args) {
        Linux linux = new Linux();
        linux.arq64();
        linux.arq86();
        linux.tipoSO();
        Windows windows = new Windows();
        windows.arq64();
        windows.arq86();
        windows.tipoSO();
    }
}
