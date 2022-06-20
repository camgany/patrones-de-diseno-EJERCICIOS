package adapter.exercise;

public class Celular implements IOriginal {

    private int precio;
    private int tiempoDeVidaEnMeses;

    public Celular(int precio, int tiempoDeVidaEnMeses) {
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

        System.out.println("El precio del celular es de: " + precio + "$");

    }

    @Override
    public void tiempoDeVida() {

        System.out.println("El tiempo de vida del celular es de: " + tiempoDeVidaEnMeses + " meses");

    }
}