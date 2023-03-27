import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }

//
////        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        int evenNumbers[] = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
        System.out.println("Even numbers:");
        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] % 2 == 0) {
                System.out.println(evenNumbers[i]);
            }
        }

//        2. Print the difference between the largest and smallest value
        int[] arrayNumbers = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
        System.out.println("First Set of Arrays:" + Arrays.toString(arrayNumbers));
        int max_value = arrayNumbers[0];
        int min_value = arrayNumbers[0];
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > max_value)
                max_value = arrayNumbers[i];
            else if (arrayNumbers[i] < min_value)
                min_value = arrayNumbers[i];
        }
        System.out.println("Difference between the largest and smallest value is:" + (max_value - min_value));

        //    3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean found = false;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                found = true;
                break;
            }
        }

        System.out.println("List contains a 1 next to a 1: " + found);


//        4. Print the sum of the numbers,
        {
            int[] sumNumbers = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
            {
                int sum = 0;
                for (int i : sumNumbers)
                    sum += i;
                System.out.println("The sum is:" + sum);
            }
        }


        //    5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        int[] vNumbers = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};


        int ans = 0;
        for (int vNumber : vNumbers) {
            if (vNumber == 13) {
                break;
            } else {
                ans += vNumber;
            }


        }
        System.out.println("The sum without 13:" + ans);


    }
}
















