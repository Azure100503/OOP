package patterns.behavioral.command.smarthome;

public class FanOnCommand implements Command{
    private  Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.startRotate();
    }
}
