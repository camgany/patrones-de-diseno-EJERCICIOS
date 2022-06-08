package observer.practice;

public class NotificacionPrecioLlamada extends Notificacion{
    private String precio;
    private String lugar;
    private String tipo;

    public NotificacionPrecioLlamada(String tipo, String precio, String lugar) {
        this.notiType = NotiType.PRECIOLLAMADA;
        this.tipo = tipo;
        this.lugar = lugar;
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void showInfo() {
        System.out.println("----------------------------------PRECIO LLAMADA----------------------------------");
        System.out.println("El tipo de la llamada es: "+tipo);
        System.out.println("El lugar de la llamada es: "+lugar);
        System.out.println("El precio de la llamada es: "+precio);
    }
}
