package chainResponsability.prectice.ejercicio1;


public class ManagerHandler implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }


    @Override
    public void criteriaHandler(Persona persona) {
        Notario resp1= new Notario();
        this.setNext(resp1);

        Cajero resp2 = new Cajero();
        resp1.setNext(resp2);

        Organizador resp3 = new Organizador();
        resp2.setNext(resp3);

        Completo resp4 = new Completo();
        resp3.setNext(resp4);

        AtencionCliente respFinal = new AtencionCliente();
        resp4.setNext(respFinal);

        this.next.criteriaHandler(persona);
    }

    @Override
    public IHandler next() {
        return next;
    }
}