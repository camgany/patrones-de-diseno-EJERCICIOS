package segundoParcial.ejercicio3.structure;

public class ConcreteObserver1 implements IObserver {
    @Override
    public void update(String msg) {
        // colocamos logica basados en el mensaje recibido
        System.out.println("ConcreteObserver1 tiene una notificacion de un evento");
        System.out.println("MSG: "+msg);

    }
}