package abstractFactory.practice.pasajes;

public class FactoryPasaje {

    public static IPasaje make(PasajeType pasajeType){
        IPasaje pasaje;
        switch (pasajeType){
            case SOLIDARIO:
                pasaje=new Solidario();
                break;
            case STANDART:
                pasaje=new Standart();
                break;
            case INFANTE:
                pasaje=new Infantes();
                break;
            default:
                pasaje=new Infantes();
                break;
        }

        return pasaje;

    }
}