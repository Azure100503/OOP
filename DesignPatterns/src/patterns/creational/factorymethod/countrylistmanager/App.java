package patterns.creational.factorymethod.countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        System.out.println("Test Original Data:");
        testOriginalData();
        System.out.println("Test filter continent");
        testFilterContinent();
        System.out.println("Test increasing population:");
        testSortIncreasingByPopulation();
        System.out.println("Test decreasing population:");
        testSortDecreasingByPopulation();
        System.out.println("Test increasing area:");
        testSortIncreasingByArea();
        System.out.println("Test decreasing area:");
        testSortDecreasingByArea();
        System.out.println("Test increasing gdp:");
        testIncreasingByGdp();
        System.out.println("Test decreasing gdp:");
        testDecreasingByGdp();
        System.out.println("Test filter most population:");
        testFilterMostPopulousCountries();
        System.out.println("Test filter least population: ");
        testFilterCountriesLeastPopulous();
        System.out.println("Test filter largest area: ");
        testFilterCountriesLargestArea();
        System.out.println("Test filter smallest area: ");
        testFilterCountriesSmallestArea();
        System.out.println("Test filter highest gdp: ");
        testFilterCountriesHighestGdp();
        System.out.println("Test filter lowest gdp: ");
        testFilterCountriesLowestGdp();




    }

    public static void readListData(String filePath) {
        CountryListManager countryListManager = CountryListManager.getInstance();
        BufferedReader dataReader = null;
        try {
            String line;
            //dataReader = new BufferedReader(new FileReader("data/nations1.csv"));
            dataReader = new BufferedReader(new FileReader(filePath));

            // How to read file in java line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .build();

                /* TODO */
                // Tạo đối tượng Country sử dụng CountryFactory,
                // sau đó cho vào CountryListManager để quản lý.
                CountryFactory countryFactory = CountryFactory.getInstance();
                AbstractCountry country = CountryFactory.getInstance().createCountry(dataList.get(5), newCountryData);
                countryListManager.append(country);



            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<String>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "/Users/nguyenthihuyensam/Documents/GitHub/OOP/DesignPatterns/src/patterns/creational/factorymethod/country/data/countries2.csv";
        readListData(filePath);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testOriginalData() {
        init();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(CountryListManager.getInstance().getCountryList());
        System.out.println(codes);
    }

    public static void testSortIncreasingByPopulation() {
        //init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByPopulation();
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortDecreasingByPopulation() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByPopulation();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testSortIncreasingByArea() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByArea();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testSortDecreasingByArea() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByArea();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testIncreasingByGdp() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByGdp();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testDecreasingByGdp() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByGdp();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testFilterContinent() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterContinent("Asia");
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testFilterMostPopulousCountries() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterMostPopulousCountries(5);
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testFilterCountriesLeastPopulous() {
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLeastPopulousCountries(5);

        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterCountriesLargestArea() {
        /* TODO */
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLargestAreaCountries(5);
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testFilterCountriesSmallestArea() {
        /* TODO */
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterSmallestAreaCountries(5);
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testFilterCountriesHighestGdp() {
        /* TODO */
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterHighestGdpCountries(5);
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }

    public static void testFilterCountriesLowestGdp() {
        /* TODO */
//        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLowestGdpCountries(5);
        String codes = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.println(codes);
    }




}
