package command.practice;

public class Juego {
    private String nombre;

    public Juego(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void action1(){
        System.out.println("Disparo Ejecutado");
    }
    public void action2(){
        //cualquier logica de acuerdo a nuestro enunciado
        System.out.println("Comando de defensa ACTIVADO");
    }
    public void action3(){
        //cualquier logica de acuerdo a nuestro enunciado
        System.out.println("Ataque Ejecutado");
    }

}

