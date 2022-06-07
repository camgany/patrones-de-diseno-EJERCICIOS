package command.practice;


public class Client {
    public static void main(String [] args){
        Juego juego = new Juego("Fortnite");

        JuegoDisparar disparar = new JuegoDisparar(juego);
        JuegoModoDefensa defensa = new JuegoModoDefensa(juego);
        JuegoAtacar atacar = new JuegoAtacar(juego);

        Defender defender = new Defender();

        defender.addCommand(disparar);
        defender.addCommand(defensa);
        defender.addCommand(atacar);

        defender.runCommands();
    }

}