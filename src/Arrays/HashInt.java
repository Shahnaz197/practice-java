package Arrays;

import java.util.HashMap;

public class HashInt {
    public static void main(String[] args) {
        HashMap<String,Integer> people =new HashMap<String,Integer>();

        people.put("rose",20);
        people.put("allen",21);
        people.put("el",22);

        for(String i:people.keySet()){
            System.out.println("name " + i + " age " + people.get(i));
        }
    }
}
/* Hashmap<String,String>capital Cities = new HashMap<String,String>();
    in new java without mentioning the hashmap and declaring the type we can directly use
    var CapitalCities = new HashMap<Stirng,String>();

 */



