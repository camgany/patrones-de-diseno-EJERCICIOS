package chainResponsability.prectice.ejercicio1;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(Persona persona);
    IHandler next();
}
