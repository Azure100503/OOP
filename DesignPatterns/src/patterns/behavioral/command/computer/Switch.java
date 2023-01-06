package patterns.behavioral.command.computer;

import java.util.LinkedList;
import java.util.List;

public class Switch {

    /* Ban dau nhu vay do. Nhung can refactor lai
    public void restartComputer(Computer computer) {
        computer.restart();
    }

    public void shutdownComputer(Computer computer) {
        computer.shutdown();
    }*/

    private List<Command> historicalCommands;
    public Switch() {
        this.historicalCommands = new LinkedList<>();
    }

    public void storeAndExecute(Command command) {
        historicalCommands.add(command);
        command.execute();
    }


}
