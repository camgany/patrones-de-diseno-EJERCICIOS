package segundoParcial.ejercicio3.exercise;

public class Imagen extends Elementos{
    String size;


    public Imagen(String size, String nombre) {
        this.size = size;
        this.nombre = nombre;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void showInfo() {
        System.out.println("*****- informacion del video -*****");
        System.out.println("size: "+size);
        System.out.println("titulo: "+nombre);
    }
}
