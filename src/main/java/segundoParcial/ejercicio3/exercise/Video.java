package segundoParcial.ejercicio3.exercise;

public class Video extends Elementos{
    String id;


    public Video(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void showInfo() {
        System.out.println("*****- informacion del video -*****");
        System.out.println("id: "+id);
        System.out.println("titulo: "+nombre);
    }
}