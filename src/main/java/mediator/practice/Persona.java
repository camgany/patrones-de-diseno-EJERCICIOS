package mediator.practice;

public abstract class Persona {
    protected ICanalComunicacion canalComunicacion;
    private String ci;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Persona(ICanalComunicacion canalComunicacion){
        this.canalComunicacion = canalComunicacion;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
