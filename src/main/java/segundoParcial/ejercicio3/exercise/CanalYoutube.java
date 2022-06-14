package segundoParcial.ejercicio3.exercise;

import java.util.ArrayList;
import java.util.List;

public class CanalYoutube implements ICanal {
    private List<Video> videoList = new ArrayList<>();
    private  List <IUser> users= new ArrayList<>();

    public CanalYoutube(){}

    public void uploadVideo(Video video){
        videoList.add(video);
        notifyObservers(video);
    }

    @Override
    public void subscription(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers(Video video) {
        for (IUser user:users ) {
            if (user.getPreferenciaCategoria().equals(video.getCategoria())){
                user.update("nuevo video agregado!",video);
            }
        }
    }
}