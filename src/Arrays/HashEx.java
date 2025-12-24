package Arrays;


import java.util.HashMap;

public class HashEx {
    public static void main(String[] args) {
        HashMap<String, String > capitalCities = new HashMap<String,String>();

        capitalCities.put("England","London");
        capitalCities.put("Colombo","Srilanka");
        capitalCities.put("Thailand","Bangkok");
        capitalCities.put("japan","Tkyo");

        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.size());
        //System.out.println(capitalCities.remove("japan"));


    }

}
