package patterns.behavioral.command.computer;

public class ShutDownCommand implements Command{
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.shutDown();

    }
}
