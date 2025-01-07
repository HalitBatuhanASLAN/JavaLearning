import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate element
        System.out.println("Initial List: " + fruits);

        // 1. Add an element at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("After adding Blueberry at index 1: " + fruits);

        // 2. Access an element by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // 3. Update an element
        fruits.set(0, "Mango");
        System.out.println("After updating index 0 to Mango: " + fruits);

        // 4. Remove an element by index
        fruits.remove(3); // Removes the element at index 3
        System.out.println("After removing element at index 3: " + fruits);

        // 5. Remove an element by value
        fruits.remove("Apple"); // Removes the first occurrence of "Apple"
        System.out.println("After removing 'Apple': " + fruits);

        // 6. Check if the list contains an element
        boolean containsCherry = fruits.contains("Cherry");
        System.out.println("Does the list contain 'Cherry'? " + containsCherry);

        // 7. Find the index of an element
        int indexOfBanana = fruits.indexOf("Banana");
        System.out.println("Index of 'Banana': " + indexOfBanana);

        // 8. Find the last index of an element (useful for duplicates)
        fruits.add("Banana");
        int lastIndexOfBanana = fruits.lastIndexOf("Banana");
        System.out.println("Last index of 'Banana': " + lastIndexOfBanana);

        // 9. Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // 10. Check if the list is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // 11. Sort the ArrayList
        Collections.sort(fruits); // Requires java.util.Collections
        System.out.println("Sorted List: " + fruits);

        // 12. Reverse the ArrayList
        Collections.reverse(fruits);
        System.out.println("Reversed List: " + fruits);

        // 13. Iterate using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 14. Iterate using a for loop with index
        System.out.println("Iterating using for loop with index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }

        // 15. Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);

        // 16. Add all elements from another collection
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits.add("Pineapple");
        newFruits.add("Grapes");
        newFruits.add("Watermelon");
        fruits.addAll(newFruits);
        System.out.println("After adding all elements from newFruits: " + fruits);

        // 17. Sublist from the ArrayList
        ArrayList<String> subList = new ArrayList<>(fruits.subList(1, 3)); // From index 1 (inclusive) to 3 (exclusive)
        System.out.println("Sublist (index 1 to 2): " + subList);

        // 18. Convert ArrayList to Array
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("Array from ArrayList:");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        // 19. Convert ArrayList to String
        String fruitsString = fruits.toString();
        System.out.println("ArrayList as String: " + fruitsString);

        // 20. Clone the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) fruits.clone();
        System.out.println("Cloned List: " + clonedList);

        // 21. Check equality of two ArrayLists
        boolean isEqual = fruits.equals(clonedList);
        System.out.println("Are the original and cloned lists equal? " + isEqual);

        // 22. Replace all elements using replaceAll()
        fruits.replaceAll(fruit -> fruit.toUpperCase()); // Converts all elements to uppercase
        System.out.println("After replacing all elements with uppercase: " + fruits);

        // 23. Iterate using forEach() method
        System.out.println("Iterating using forEach() method:");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
