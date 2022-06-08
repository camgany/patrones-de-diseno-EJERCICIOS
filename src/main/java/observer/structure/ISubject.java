package observer.structure;

public interface ISubject {
    void attach(IObserver observer);//agregar/adjuntar a los observadores
    void detach(IObserver observer);//eliminar a los observadores
    void notifyObservers(String msg);
}