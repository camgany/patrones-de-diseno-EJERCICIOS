package segundoParcial.ejercicio2;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(int amount);
    IHandler next();
}
