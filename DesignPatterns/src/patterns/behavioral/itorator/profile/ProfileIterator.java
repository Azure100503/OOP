package patterns.behavioral.itorator.profile;
public interface ProfileIterator {
    public Profile getNext();
    public boolean hasNext();
    public void reset();
}
