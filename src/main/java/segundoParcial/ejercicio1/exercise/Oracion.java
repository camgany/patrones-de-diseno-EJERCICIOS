package segundoParcial.ejercicio1.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Oracion {
    ConcreteObject concreteObject;
    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();
    int contador = 1;
    public void addOracion(String oracion){
        StringTokenizer st = new StringTokenizer(oracion);
        if( st.countTokens() >= 5){
            concreteObject = new ConcreteObject(oracion, "version"+ contador);
            contador++;
            originator.setMemento(concreteObject);
            caretaker.addMemento(originator.createMemento());
        }

    }
    public void verOracion(int position){
        concreteObject= originator.restoreMemento(caretaker.getMemento(position-1));
        concreteObject.showInfo();
    }
}
