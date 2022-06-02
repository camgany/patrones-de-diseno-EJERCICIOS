package mediator.practice;

public class ConcreteQa extends Persona{
    private String nombre;
    private String grado;

    public ConcreteQa(ICanalComunicacion canalComunicacion){
        super(canalComunicacion);
    }
    @Override
    public void send(String msg) {
        canalComunicacion.send(msg, this);
    }
    @Override
    public void received(String msg) {
        System.out.println("DEV received: ["+ msg +"]");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
