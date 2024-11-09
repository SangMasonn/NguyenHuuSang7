
package assignments.pkg7;

import java.util.ArrayList;

public class ConvertAL_to_AR {

    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();

      
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

      
        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array);

        
        System.out.println("Elements of the array:");
        for (int number : array) {
            System.out.println(number);
        }
    }
    
}
    
