package patterns.behavioral.command.texteditor;

public class CutCommand extends Command{
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
