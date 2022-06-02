package mediator.practice;

public class ConcreteSm extends Persona{
    private String nombre;
    private String certificaciones;

    public ConcreteSm(ICanalComunicacion canalComunicacion){
        super(canalComunicacion);
    }
    @Override
    public void send(String msg) {
        canalComunicacion.send(msg, this);
    }
    @Override
    public void received(String msg) {
        System.out.println("SM received: [ "+getNombre()+", "+ msg +" ]");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }
}
