package patterns.behavioral.observer.demo;



public class OctalObserver extends Observer{

    private String octal;
    public OctalObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    public void update() {
        this.octal = convertToOctal(this.subject.getState());
        System.out.println("Octal: " + this.octal);

    }

    private String convertToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
}
