import java.util.*;

public class a_11_13 {

    /*
    13. Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if
    no two keys map to the same value (and false if any two or more keys do map to the same value). For example, if
    the map contains the following key/value pairs, your method would return true: {Marty=Stepp, Stuart=Reges,
    Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would return false,
    because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller,
    Bruce=Reges, Hal=Perkins}.
     */

    public static void main(String[] args) {

        Map<String, String> testMap1 = new HashMap<>();
        Map<String, String> testMap2 = new HashMap<>();

        testMap1.put("Marty", "Stepp");
        testMap1.put("Stuart", "Reges");
        testMap1.put("Jessica", "Miller");
        testMap1.put("Amanda", "Camp");
        testMap1.put("Hal", "Perkins");

        testMap2.put("Kendrick", "Perkins");
        testMap2.put("Stuart", "Reges");
        testMap2.put("Jessica", "Miller");
        testMap2.put("Bruce", "Reges");
        testMap2.put("Hal", "Perkins");

        System.out.println("Result should be true: " + isUnique(testMap1));
        System.out.println("Result should be false: " + isUnique(testMap2));
    }

    public static boolean isUnique(Map<String, String> map) {

        // makes a set containing the keys of the map
        Set<String> setOfKeys = map.keySet();

        // makes a collection containing the values of the map
        Collection<String> collectionOfMapValues = map.values();

        // makes a set of the values (automatically removes duplicates, due to HastSet)
        Set<String> setOfValues = new HashSet<>(collectionOfMapValues);

        boolean returnBoolean = true;

        // If the setOfValues is not == the setOfKeys it means that the HashSet has removed duplicates
        // and therefor there was two or more keys who maps to the same value and the variable is set to false
        if (!(setOfKeys.size() == setOfValues.size())) {
           returnBoolean = false;
        }

        return returnBoolean;
    }
}
