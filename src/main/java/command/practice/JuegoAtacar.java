package command.practice;

public class JuegoAtacar implements ICommand {
    private Juego receiver;

    public JuegoAtacar(Juego receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        System.out.println("Preparandose para atacar al enemigo.......");
        receiver.action3();
    }
}