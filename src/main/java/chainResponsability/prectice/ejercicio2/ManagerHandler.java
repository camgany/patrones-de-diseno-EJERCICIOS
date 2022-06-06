package chainResponsability.prectice.ejercicio2;


import java.util.ArrayList;

public class ManagerHandler implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(ArrayList<Persona> personas) {
        AlgoritmoSeleccion resp1= new AlgoritmoSeleccion();
        this.setNext(resp1);

        AlgoritmoBurbuja resp2 = new AlgoritmoBurbuja();
        resp1.setNext(resp2);

        AlgoritmoInsercion resp3 = new AlgoritmoInsercion();
        resp2.setNext(resp3);


        this.next.criteriaHandler(personas);
    }

    @Override
    public IHandler next() {
        return next;
    }
}