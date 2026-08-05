import java.util.Scanner;
import java.util.ArrayList;

public class TravelManagement {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n======Menu====");
            System.out.println("1. Add City \n2. Insert City \n3. Search City \n4. Display Cities Starting with Letter \n5. Display \n6. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a City to Add :");
                    String city = sc.next();
                    cities.add(city);
                    System.out.println("City Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter the index to insert: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index <= cities.size()) {
                        System.out.println("Enter a City to Add :");
                        String insertCity = sc.next();
                        cities.add(index, insertCity);
                        System.out.println("City Inserted Successfully");
                    } else {
                        System.out.println("Invalid index! Active range: 0 to " + cities.size());
                    }
                    break;

                case 3:
                    System.out.println("Enter a City to Search:");
                    String sCity = sc.next();
                    int sIndex = -1; // Standard way to represent "Not Found"

                    for (int i = 0; i < cities.size(); i++) {
                        if (cities.get(i).equalsIgnoreCase(sCity)) {
                            sIndex = i;
                            break; // Stop searching once found
                        }
                    }

                    if (sIndex != -1) {
                        System.out.println("The City found at index : " + sIndex);
                    } else {
                        System.out.println("City Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter Starting Letter:");
                    String sL = sc.next();
                    boolean foundAny = false;
                    for (String s : cities) {
                        if (s.toLowerCase().startsWith(sL.toLowerCase())) {
                            System.out.println(s);
                            foundAny = true;
                        }
                    }
                    if (!foundAny) {
                        System.out.println("No cities found starting with '" + sL + "'");
                    }
                    break;

                case 5:
                    System.out.println("Cities in the list: " + cities);
                    break;

                case 6:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Enter a Valid choice");
                    break;
            }
        } while (choice != 6);
    }
}
