package memento.practice;


public class Memento {
    private BaseDatos state;

    public Memento(BaseDatos concreteObject) {
        state = concreteObject;
    }
    public BaseDatos getState() {
        return state;
    }
}
