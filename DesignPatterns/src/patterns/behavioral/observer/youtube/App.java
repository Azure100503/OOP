package patterns.behavioral.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        YoutubeChanel myChanel = new YoutubeChanel("Colencauoi");

        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer(myChanel, "Sam"));
        viewers.add(new Viewer(myChanel, "Thang"));
        viewers.add(new Viewer(myChanel, "Thao"));

        myChanel.publishAVideo();

    }
}
