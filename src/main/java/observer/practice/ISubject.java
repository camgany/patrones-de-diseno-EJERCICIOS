package observer.practice;

public interface ISubject {
    //notificacion
    void attach(IObserver observer);//agregar/adjuntar a los observadores
    void detach(IObserver observer, NotiType notiType);//eliminar a los observadores
    void notifyObservers(Notificacion notificacion);
}