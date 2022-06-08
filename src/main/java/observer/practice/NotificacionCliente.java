package observer.practice;

import java.util.ArrayList;
import java.util.List;

public class NotificacionCliente implements ISubject {

    private List<IObserver> observers = new ArrayList<>();
    private List<Notificacion> notificacions = new ArrayList<>();
    private Cliente cliente;

    public NotificacionCliente() {

    }

    public void add(Notificacion notificacion){
        notificacions.add(notificacion);
        notifyObservers(notificacion);
    }
    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer, NotiType notiType) {
        if(observer.getNotiTypeSet().contains(notiType)){
            observer.getNotiTypeSet().remove(notiType);
        }
    }


    @Override
    public void notifyObservers(Notificacion notificacion) {
        for (IObserver obs:observers) {
            if (obs.getNotiTypeSet().contains(notificacion.getNotiType())){
                obs.update(notificacion);
                }
            }
        }

}