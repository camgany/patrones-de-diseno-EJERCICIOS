package memento.practice;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {//base de datos
    private List<Persona> personas = new ArrayList<>();
//se pasan datos nuevos
    public BaseDatos( ){
       // this.personas =personas;
    }
    public void add (Persona persona){
        personas.add(persona);
    }
    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }


    public void showInfo() {
        for (Persona persona : personas
             ) {
            System.out.println("Nombre: "+persona.getNombre());
        }
    }
}