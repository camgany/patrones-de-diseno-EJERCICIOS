package segundoParcial.ejercicio1.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObject {
    private String state;
    private String oracion;
    public ConcreteObject (String oracion,String state){
        this.state=state;
        this.oracion = oracion;
    }




    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void showInfo() {
        System.out.println("ORACION: "+oracion);
        System.out.println("VERSION: "+state );
    }
}