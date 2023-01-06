package patterns.behavioral.command.texteditor;

public abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public abstract boolean execute();
}
