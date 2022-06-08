package observer.practice;

import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main (String [] args){
        NotificacionCliente subject = new NotificacionCliente();
        NotificacionPromocion promocion = new NotificacionPromocion("Anual");
        //NotificacionPromocion promocion2 = new NotificacionPromocion("Diario");
        NotificacionPremio premio = new NotificacionPremio("Acumulacion Minutos","Premio por minutos acumulados");
        NotificacionNoticia noticia = new NotificacionNoticia(
                "Arias insiste en que es necesario reactivar la presentación del carnet de vacunación");
        NotificacionPrecioLlamada llamada = new NotificacionPrecioLlamada("Internacional","456Bs","La Paz");



        Cliente c1 = new Cliente(Set.of(NotiType.PREMIO,NotiType.PROMOCION),new Persona("45546","Camila"));
        subject.attach(c1);
        subject.detach(c1,NotiType.PREMIO);
        subject.attach(new Cliente(Set.of(NotiType.NOTICIA,NotiType.PREMIO),new Persona("43346","Dylan")));
        subject.attach(new Cliente(Set.of(NotiType.PRECIOLLAMADA,NotiType.PROMOCION), new Persona("4354", "Jaden")));
        subject.attach(new Cliente(Set.of(NotiType.PRECIOLLAMADA), new Persona("1212", "Maria")));
        subject.add(promocion);
        subject.add(premio);
        subject.add(noticia);
        subject.add(llamada);





    }
}