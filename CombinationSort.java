import java.util.*;
public class CombinationSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();   // Taking inputs
        String[] inputList = input.split(", "); // Split the input by comma space and store it in the String Array
        ArrayList<String> L1 = new ArrayList<>(Arrays.asList(inputList)); // Add input strings to L1
        ArrayList<String> L2 = new ArrayList<>();  // Initialize L2 as ArrayList

        sort(L1, L2);  //Function Call
    }
    public static void sort(ArrayList<String> L1, ArrayList<String> L2){

        L1.sort(Comparator.comparingInt(a -> a.charAt(0))); // Sort L1 by first letter only
        for (int i = 0; i < 26; i++) {   // Iterate through the alphabet
            char c = (char) ('a' + i);
            ArrayList<String> tempList = new ArrayList<>();

            for (String s : L1) {      // Extract all strings starting with letter c
                if (s.charAt(0) == c) {
                    tempList.add(s);
                }
            }
            // Sort tempList by number
            tempList.sort((a, b) -> Integer.parseInt(b.substring(1)) - Integer.parseInt(a.substring(1)));
            L2.addAll(tempList); // Add tempList to L2
        }
        System.out.println("L1: " + L1);   // Print L1 and L2
        System.out.println("L2: " + L2);
    }
}

// Time Complexity = O(n Log n)
// Space Complexity = O(n)