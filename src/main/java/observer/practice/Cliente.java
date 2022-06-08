package observer.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cliente implements IObserver {
    private Persona persona;
    private HashSet<NotiType> notiTypeSet = new HashSet<>();

    public Cliente(Set<NotiType> notiTypeSet, Persona persona) {
        this.notiTypeSet = new HashSet<>(notiTypeSet);
        this.persona = persona;
    }

    @Override
    public void update(Notificacion notificacion) {
        System.out.println("*********************************************************************8");
        System.out.println("Nombre: "+persona.getName()+ " CI: "+persona.getCi());
        notificacion.showInfo();
    }

    @Override
    public Set<NotiType> getNotiTypeSet() {
        return notiTypeSet;
    }
    //@Override
    //public Map<Persona,NotiType> getPersonaNotiTypeMap(){
    //    return personaNotiTypeMap;
    //}
}