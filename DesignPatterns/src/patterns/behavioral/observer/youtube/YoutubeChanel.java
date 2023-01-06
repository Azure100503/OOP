package patterns.behavioral.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChanel {
    private List<Viewer> viewers = new ArrayList<>();
    private String chanelName;

    public YoutubeChanel(String chanelName) {
        this.chanelName = chanelName;
    }

    public String getChanelName() {
        return chanelName;
    }

    public void publishAVideo() {
        notifyAllSubscribers();
    }

    public void subscribe(Viewer viewer) {
        if (!viewers.contains(viewer)) {
            viewers.add(viewer);
        }
    }

    public void unsubscribe(Viewer viewer) {
        if (viewers.contains(viewer)) {
            viewers.remove(viewer);
        }
    }

    public void notifyAllSubscribers() {
        for (Viewer observer: viewers
             ) {
            observer.update();
        }
    }
}
