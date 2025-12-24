package Arrays;

import java.util.LinkedHashMap;

public class linkedhasQ {
    public static void main(String[] args) {
        LinkedHashMap<String,String> capCity = new LinkedHashMap<>();

        capCity.put("England", "London");
        capCity.put("India", "New Dehli");
        capCity.put("Austria", "Wien");
        capCity.put("Norway", "Oslo");
        capCity.put("Norway", "Oslo"); // Duplicate
        capCity.put("USA", "Washington DC");

        System.out.println(capCity.get("India"));
    }
}
