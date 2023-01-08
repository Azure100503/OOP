package patterns.creational.factorymethod.bank;

public class BankFactory {
    public static BankFactory instance;

    private BankFactory(){

    }

    public static BankFactory getInstance() {
        if (instance == null) {
            instance = new BankFactory();
        }
        return instance;
    }

    public Bank getBank(String type) {
        if (type.equals("TP")) {
            return new TPBank();
        } else {
            return new VietcomBank();
        }
    }
}
