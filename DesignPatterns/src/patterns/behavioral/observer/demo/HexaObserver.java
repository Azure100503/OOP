package patterns.behavioral.observer.demo;


public class HexaObserver extends Observer{

    private String hexa;
    public HexaObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    public void update() {
        this.hexa = convertToHexa(this.subject.getState());
        System.out.println("Hexa: " + this.hexa);

    }
    private String convertToHexa(int decimal) {
        return Integer.toHexString(decimal);

    }
}
