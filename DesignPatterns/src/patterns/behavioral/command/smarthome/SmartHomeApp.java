package patterns.behavioral.command.smarthome;

public class SmartHomeApp {
    private Command upCommand;
    private Command downCommand;

    public SmartHomeApp(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    public void flipUp() {
        this.upCommand.execute();
    }

    public void flipDown() {
        this.downCommand.execute();
    }
}
