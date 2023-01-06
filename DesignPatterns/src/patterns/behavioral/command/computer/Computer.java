package patterns.behavioral.command.computer;

public class Computer {
    public Computer() {
    }

    public void shutDown() {
        System.out.println("Computer is shutting down");
    }

    public void restart() {
        System.out.println("Computer is restarting");
    }
}
