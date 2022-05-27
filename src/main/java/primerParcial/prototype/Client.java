package primerParcial.prototype;

public class Client {
    public static void main(String[]args){

        Contrato template = new Contrato();
        template.setSueldo(5000);
        template.setCargaHoraria(80);
        template.setCursoEducacionSuperior(true);
        template.setAccesoPlataforma(true);
        template.setMercadoBiometrico(false);
        template.setMercadoHoraEntrada("08:00");
        template.setMercadoHoraSalida("18:00");

        Contrato contrato1 = (Contrato) template.clone();
        contrato1.setPersona(new Persona("Laura","Bozzo",565578));
        contrato1.showInfo();

        Contrato contrato2 = (Contrato) template.clone();
        contrato2.setPersona(new Persona("Jaden","Hosser",123238));
        contrato2.showInfo();

        Contrato contrato3 = (Contrato) template.clone();
        contrato3.setPersona(new Persona("Nicole","Kidman",2344654));
        contrato3.showInfo();

        Contrato contrato4 = (Contrato) template.clone();
        contrato4.setPersona(new Persona("Manelik","Gonzales",223436));
        contrato4.showInfo();

        Contrato contrato5 = (Contrato) template.clone();
        contrato5.setPersona(new Persona("Justin","Bieber",354557));
        contrato5.showInfo();

        Contrato contrato6 = (Contrato) template.clone();
        contrato6.setPersona(new Persona("Nessa","Barrent",7897870));
        contrato6.showInfo();

        Contrato contrato7 = (Contrato) template.clone();
        contrato7.setPersona(new Persona("Brenda","Zambrano",787890));
        contrato7.showInfo();

        Contrato contrato8 = (Contrato) template.clone();
        contrato8.setPersona(new Persona("Harry","Styles",8878865));
        contrato8.showInfo();

        Contrato contrato9 = (Contrato) template.clone();
        contrato9.setPersona(new Persona("Mario","Ruiz",898054));
        contrato9.showInfo();

        Contrato contrato10 = (Contrato) template.clone();
        contrato10.setPersona(new Persona("Selena","Gomez",235232));
        contrato10.showInfo();

        Contrato contrato11 = (Contrato) template.clone();
        contrato11.setPersona(new Persona("Ariana","Grande",898968));
        contrato11.showInfo();

        Contrato contrato12 = (Contrato) template.clone();
        contrato12.setPersona(new Persona("Doja","Cat",245436));
        contrato12.showInfo();

        Contrato contrato13 = (Contrato) template.clone();
        contrato13.setPersona(new Persona("Cameron","Dallas",126756));
        contrato13.showInfo();

        Contrato contrato14 = (Contrato) template.clone();
        contrato14.setPersona(new Persona("Caleb","Burton",245345));
        contrato14.showInfo();

        Contrato contrato15 = (Contrato) template.clone();
        contrato15.setPersona(new Persona("Brent","Rivera",4547658));
        contrato15.showInfo();
    }
}
