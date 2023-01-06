package patterns.behavioral.observer.textnotify;

import java.io.File;

public interface EventListener {
    public void update(String evenType, File filename);
}
