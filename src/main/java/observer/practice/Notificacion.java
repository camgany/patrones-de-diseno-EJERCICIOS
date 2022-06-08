package observer.practice;

public abstract class Notificacion {
    protected NotiType notiType;
    public NotiType getNotiType(){
        return notiType;
    }

    public abstract void showInfo();
}
