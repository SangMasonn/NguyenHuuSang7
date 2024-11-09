
package assignments.pkg7;

import java.util.ArrayList;


public class Search {

    public static void main(String[] args) {
       ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        if (languages.contains("Python")) {
            System.out.println("Python is in the list.");
        } else {
            System.out.println("Python is not in the list.");
        }
    }
    
}
