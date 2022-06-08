package observer.practice;

import java.util.Set;

public interface IObserver {
    void update(Notificacion notificacion);
    Set<NotiType> getNotiTypeSet();
}