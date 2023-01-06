package patterns.behavioral.command.computer;

public class TestCommand {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Switch mySwitch = new Switch();

        /*mySwitch.shutdownComputer(computer);
        mySwitch.restartComputer(computer);*/

        Command command1 = new ShutDownCommand(computer1);
        Command command2 = new RestartCommand(computer1);

        mySwitch.storeAndExecute(command1);
        mySwitch.storeAndExecute(command2);
        System.out.println();

    }
}
