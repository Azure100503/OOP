package patterns.creational.factorymethod.countrylistmanager;

public class CountryFactory {
    public static CountryFactory instance;

    private CountryFactory() {
    }

    public AbstractCountry createCountry(String type, CountryData data) {
        if (type.equals("Asia")) {
            return new AfricaCountry(data);
        } else if (type.equals("Africa")) {
            return new AfricaCountry(data);
        } else if (type.equals("Europe")) {
            return new EuropeCountry(data);
        } else if (type.equals("North America")) {
            return new NorthAmericaCountry(data);
        } else if (type.equals("South America")) {
            return new SouthAmericaCountry(data);
        } else {
            return new OceaniaCountry(data);
        }
    }

    //Singleton pattern
    public static CountryFactory getInstance() {
        if (instance == null) {
            instance = new CountryFactory();
        }
        return instance;
    }
}
