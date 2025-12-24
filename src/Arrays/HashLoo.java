package Arrays;

import java.util.HashMap;

public class HashLoo {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();

        capitalCities.put("England","London");
        capitalCities.put("Colombo","Srilanka");
        capitalCities.put("Thailand","Bangkok");
        capitalCities.put("japan","Tkyo");
        for (String i : capitalCities.keySet()){
            System.out.println(" key: " + i + " value: " + capitalCities.get(i) + " hash: " + i.hashCode());
        }


    }
}
