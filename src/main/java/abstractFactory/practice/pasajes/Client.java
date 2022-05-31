package abstractFactory.practice.pasajes;

public class Client {

    public static void main (String[]args){


        FactoryPasaje.make(PasajeType.INFANTE).showInfo();
        FactoryPasaje.make(PasajeType.SOLIDARIO).showInfo();
        FactoryPasaje.make(PasajeType.STANDART).showInfo();


    }
}
