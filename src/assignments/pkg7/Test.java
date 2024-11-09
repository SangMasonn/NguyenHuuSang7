
package assignments.pkg7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
          
            System.out.println("\nMenu:");
            System.out.println("1. Add a friend");
            System.out.println("2. Remove a friend");
            System.out.println("3. View all friends");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:                  
                    addFriend(friends, scanner);
                    break;
                case 2:                   
                    removeFriend(friends, scanner);
                    break;
                case 3:                   
                    viewFriends(friends);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    
    public static void addFriend(ArrayList<String> friends, Scanner scanner) {
        System.out.print("Enter the name of the friend to add: ");
        String name = scanner.nextLine();
        friends.add(name);
        System.out.println(name + " has been added to the friends list.");
    }
    
    public static void removeFriend(ArrayList<String> friends, Scanner scanner) {
        if (friends.isEmpty()) {
            System.out.println("The friends list is empty. There is nothing to remove.");
            return;
        }

        System.out.print("Enter the name of the friend to remove: ");
        String name = scanner.nextLine();

        if (friends.remove(name)) {
            System.out.println(name + " has been removed from the friends list.");
        } else {
            System.out.println(name + " was not found in the friends list.");
        }
    }

    public static void viewFriends(ArrayList<String> friends) {
        if (friends.isEmpty()) {
            System.out.println("The friends list is empty.");
        } else {
            System.out.println("Friends List:");
            for (String friend : friends) {
                System.out.println("- " + friend);
            }
        }
    }
}

