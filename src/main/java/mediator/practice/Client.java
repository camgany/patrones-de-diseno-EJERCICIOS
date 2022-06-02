package mediator.practice;


public class Client {
    public static void main(String[]args){
        Skype skype = new Skype();

        ConcreteDev dev = new ConcreteDev(skype);
        ConcreteDev dev2 = new ConcreteDev(skype);
        ConcreteDev dev3 = new ConcreteDev(skype);
        ConcreteQa qa = new ConcreteQa(skype);
        ConcreteQa qa2 = new ConcreteQa(skype);
        ConcreteQa qa3 = new ConcreteQa(skype);
        ConcreteSm sm = new ConcreteSm(skype);
        ConcreteSm sm2 = new ConcreteSm(skype);
        ConcreteSm sm3 = new ConcreteSm(skype);

        dev.setCi("35436");
        dev.setLenguaje("Java");
        dev.setNombre("Laura Bozzo");

        dev2.setCi("67457");
        dev2.setLenguaje("Python");
        dev2.setNombre("Ricardo Styles");

        dev3.setCi("69887");
        dev3.setLenguaje("JavaScript");
        dev3.setNombre("Ricardo Perez");

        qa.setNombre("Niurka Lobo");
        qa.setGrado("Master");
        qa.setCi("465876");

        qa2.setNombre("Mario Loza");
        qa2.setGrado("Estudent");
        qa2.setCi("5654654");

        qa3.setNombre("Ariana Grande");
        qa3.setGrado("Advisor");
        qa3.setCi("787654");

        sm.setCi("3467547");
        sm.setNombre("Ignacio Monasterios");
        sm.setCertificaciones("4");

        sm2.setCi("687686");
        sm2.setNombre("Manu Rios");
        sm2.setCertificaciones("12");

        sm3.setCi("435342");
        sm3.setNombre("Aaron Piper");
        sm3.setCertificaciones("1");

        skype.addDEV(dev);
        skype.addQA(qa);
        skype.addSM(sm);
        skype.addDEV(dev2);
        skype.addQA(qa2);
        skype.addSM(sm2);
        skype.addDEV(dev3);
        skype.addQA(qa3);
        skype.addSM(sm3);

        dev.send("Hola del primer DEV");
        dev2.send("Hola del segundo DEV");
        dev3.send("Hola del tercer DEV");
        qa.send("Hola del primer QA");
        qa2.send("Hola del segundo QA");
        qa2.send("Hola del tercer QA");
        sm.send("Hola del primer SM");
        sm2.send("Hola del segundo SM");
        sm2.send("Hola del tercer SM");

    }
}
