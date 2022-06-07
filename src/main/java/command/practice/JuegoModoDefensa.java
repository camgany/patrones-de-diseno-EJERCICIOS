package command.practice;


public class JuegoModoDefensa implements ICommand {
    private Juego receiver;

    public JuegoModoDefensa(Juego receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        System.out.println("Comando de defensa ejecutandose.....");
        receiver.action2();
    }
}