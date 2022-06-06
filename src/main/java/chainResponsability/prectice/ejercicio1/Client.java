package chainResponsability.prectice.ejercicio1;


public class Client {
    public static void main(String []args){

        ManagerHandler managerHandler= new ManagerHandler();
        Persona p1 = new Persona();
        p1.setCertificado("certificado correcto");
        p1.setFicha(34);
        managerHandler.criteriaHandler(p1);
        Persona p2 = new Persona();
        managerHandler.criteriaHandler(p2);

        Persona p3 = new Persona();
        p3.setCertificado("certificado correcto");
        p3.setFicha(34);
        p3.setPago(435);
        managerHandler.criteriaHandler(p3);

    }
}

