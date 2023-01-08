package patterns.creational.factorymethod.bank;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getInstance().getBank("TP");
        String name = bank.getBankName();
        System.out.println(name);
    }
}
