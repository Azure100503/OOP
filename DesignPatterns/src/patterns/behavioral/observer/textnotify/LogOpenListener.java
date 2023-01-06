package patterns.behavioral.observer.textnotify;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String evenType, File filename) {
        System.out.println("Save to log + log " + log + ": Someone has performed " + evenType
        + " operation with the following file: " + log.getName());

    }
}
