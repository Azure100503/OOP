package patterns.behavioral.observer.demo;

public class BinaryObserver extends Observer{
    private String binary;

    public BinaryObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);

    }

    public void update() {
        this.binary = convertDecimalToBinary(this.subject.getState());
        System.out.println("Binary :" + this.binary);

    }
    private String convertDecimalToBinary(int decimal) {
        //TODO
        return Integer.toBinaryString(decimal);

    }
}
