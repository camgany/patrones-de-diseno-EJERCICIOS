package observer.practice;

public class NotificacionPromocion extends Notificacion{
    private String tipo;

    public NotificacionPromocion(String tipo) {
        this.notiType = NotiType.PROMOCION;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void showInfo() {
        System.out.println("----------------------------------PROMOCION----------------------------------");
        System.out.println("El tipo de la Promocion es: "+tipo);
    }
}
