package segundoParcial.ejercicio1.structure.structure;

public class Memento {
    private ConcreteObject state;

    public Memento (ConcreteObject concreteObject){
        state=concreteObject;
    }

    public ConcreteObject getState() {
        return state;
    }
}