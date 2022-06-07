package command.practice;


public class JuegoDisparar implements ICommand {
    private Juego receiver;

    public JuegoDisparar(Juego receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        System.out.println("Detectando al enemigo...........");
        receiver.action1();
    }
}