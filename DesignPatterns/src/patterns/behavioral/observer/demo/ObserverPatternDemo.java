package patterns.behavioral.observer.demo;


public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject(123);
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        binaryObserver.update();
        hexaObserver.update();
        octalObserver.update();


    }
}
