package observer.practice;

public class NotificacionNoticia extends Notificacion{
    private String titulo;

    public NotificacionNoticia( String titulo) {
        this.notiType = NotiType.NOTICIA;
        this.titulo =titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public void showInfo() {
        System.out.println("----------------------------------NOTICIA----------------------------------");
        System.out.println("El nombre del titulo es: "+titulo);
    }
}
