
package assignments.pkg7;

import java.util.ArrayList;

public class TraversetheArrayList {

    public static void main(String[] args) {
       ArrayList<String> cities = new ArrayList<>();

        // Add names of 5 cities to the ArrayList
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        
        for (String city : cities) {
            System.out.println(city);
        }
    
    }
}