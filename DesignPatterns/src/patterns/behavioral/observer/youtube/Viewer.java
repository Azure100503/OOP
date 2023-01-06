package patterns.behavioral.observer.youtube;

public class Viewer {
    private YoutubeChanel subscribedChanel;
    private String name;

    public Viewer(YoutubeChanel subscribedChanel, String name) {
        this.subscribedChanel = subscribedChanel;
        subscribedChanel.subscribe(this);
        this.name = name;
    }

    public void update() {
        System.out.println(name +": Chanel " + subscribedChanel.getChanelName() + " has published a video!");

    }
}
