package observer.practice;

public class NotificacionPremio extends Notificacion{
    private String tipo;
    private String nombre;

    public NotificacionPremio(String tipo,String nombre) {
        this.notiType = NotiType.PREMIO;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void showInfo() {
        System.out.println("----------------------------------PREMIO----------------------------------");
        System.out.println("El tipo de la Premio es: "+tipo);
        System.out.println("El nombre del Premio es: "+nombre);
    }
}
