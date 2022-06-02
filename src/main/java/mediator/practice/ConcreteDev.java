package mediator.practice;


public class ConcreteDev extends Persona {
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
       System.out.println("DEV received: [ "+getNombre()+", "+ msg +" ]");
   }


    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
