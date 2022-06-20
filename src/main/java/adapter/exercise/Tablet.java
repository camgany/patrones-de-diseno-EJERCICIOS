package adapter.exercise;

public class Tablet implements IOriginal {

    private int precio;
    private int tiempoDeVidaEnMeses;

    public Tablet(int precio, int tiempoDeVidaEnMeses) {
        this.precio = precio;
        this.tiempoDeVidaEnMeses = tiempoDeVidaEnMeses;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempoDeVidaEnMeses() {
        return tiempoDeVidaEnMeses;
    }

    public void setTiempoDeVidaEnMeses(int tiempoDeVidaEnMeses) {
        this.tiempoDeVidaEnMeses = tiempoDeVidaEnMeses;
    }

    @Override
    public void precio() {

        System.out.println("Precio Tablet: " + precio);

    }

    @Override
    public void tiempoDeVida() {

        System.out.println("Tiempo de vida Tablet: " + tiempoDeVidaEnMeses + " meses");

    }
}