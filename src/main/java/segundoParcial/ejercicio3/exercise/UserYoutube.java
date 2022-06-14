package segundoParcial.ejercicio3.exercise;

public class UserYoutube implements IUser {

    Persona persona;

    public UserYoutube( Persona persona, ) {
        this.persona = persona;
    }

    @Override
    public void update(String msg, Video newVideo) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("persona: "+persona.getName());
        newVideo.showInfo();
    }

    @Override
    public String getPreferenciaCategoria() {
        return categoria;
    }

    public Persona getPersona() {
        return persona;
    }
}