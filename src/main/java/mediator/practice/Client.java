package mediator.practice;


public class Client {
    public static void main(String[]args){
        Skype skype = new Skype();

        ConcreteDev cv = new ConcreteDev(skype);
        ConcreteDev cv2 = new ConcreteDev(skype);
        ConcreteQa qa = new ConcreteQa(skype);
        ConcreteSm sm = new ConcreteSm(skype);

        cv.setCi("@35436");
        cv.setLenguaje("Java");
        cv.setNombre("Laura Bozzo");

        cv2.setCi("56567457");
        cv2.setLenguaje("Python");
        cv2.setNombre("Laura Bozzo");

        qa.setNombre("Niurka Lobo");
        qa.setGrado("Master");
        qa.setCi("465876");

        sm.setCi("3467547");
        sm.setNombre("Ignacio");
        sm.setCertificaciones("4");

        skype.addDEV(cv);
        skype.addQA(qa);
        skype.addSM(sm);
        skype.addDEV(cv2);

        cv.send("hi");
        cv2.send("fsdf");
        qa.send("fsfe");
        sm.send("hola");

    }
}
