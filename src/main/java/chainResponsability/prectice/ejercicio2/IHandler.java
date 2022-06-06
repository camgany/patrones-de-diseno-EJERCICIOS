package chainResponsability.prectice.ejercicio2;

import java.util.ArrayList;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(ArrayList<Persona> personas);
    IHandler next();
}
