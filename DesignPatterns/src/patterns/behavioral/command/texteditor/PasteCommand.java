package patterns.behavioral.command.texteditor;

public class PasteCommand extends Command{
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
