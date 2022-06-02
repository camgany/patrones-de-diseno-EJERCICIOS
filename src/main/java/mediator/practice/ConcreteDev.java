package mediator.practice;


public class ConcreteDev extends Persona {
    private String nombre;
    private String lenguaje;

   public ConcreteDev(ICanalComunicacion canalComunicacion){
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


    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
