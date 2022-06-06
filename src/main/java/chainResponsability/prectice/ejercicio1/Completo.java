package chainResponsability.prectice.ejercicio1;

public class Completo implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (persona.getCertificado()!="no tiene" && persona.getFicha()!=0 && persona.getPago()!=0){
            System.out.println("Usted puede ser atendido por segip");
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}