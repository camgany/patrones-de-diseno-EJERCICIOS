package strategy.practice;

public class Ropa {
    private String tipo;
    private double precio;
    private double precioDescuento;

    public Ropa(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(double precioDescuento) {
        this.precioDescuento = precioDescuento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
