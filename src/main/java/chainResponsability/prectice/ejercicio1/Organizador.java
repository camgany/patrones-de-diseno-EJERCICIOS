package chainResponsability.prectice.ejercicio1;

public class Organizador implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (persona.getCertificado()!="no tiene" && persona.getFicha()==0 && persona.getPago()!=0){
            System.out.println("Sera guiado a un organizador para recibir ficha de atencion");
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
