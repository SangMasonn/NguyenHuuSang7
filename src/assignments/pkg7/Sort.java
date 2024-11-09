
package assignments.pkg7;

import java.util.ArrayList;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                 
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted List: " + numbers);
    }
    
}
