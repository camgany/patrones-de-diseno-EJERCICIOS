package memento.practice;

import java.util.HashMap;
import java.util.Map;

//Lo que va a contener everything.
public class Caretaker {
    // objeto que almacena momentos/stados ---> LIST
    private Map<String,Memento> stateList = new HashMap();

    public void addMemento(String nombre, Memento m){
        stateList.put(nombre,m);
    }

    // forma de obtener objetos de nuestro almacenador de datos ---> LIST
    public Memento getMemento(String alias){
        return stateList.get(alias);
    }


}