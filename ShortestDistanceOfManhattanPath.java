import java.text.DecimalFormat;
import java.util.*;

public class ShortestDistanceOfManhattanPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] start = new int[2];   // Initialize input array for starting point X and Y

        for(int i=0;i<2;i++){       // Taking Inputs from user
            start[i] = sc.nextInt();
        }
        String path = sc.next();    // Initialize and getting inputs from user for the Path
        double ans= shortestDistance(start, path);  // Calling the function and store it in double
        DecimalFormat df=new DecimalFormat("#.#");  // Formatting Double Value
        System.out.println(df.format(ans));
    }

    public static double shortestDistance(int[] start, String path) {
        int x = start[0];   // Take start[0] as X
        int y = start[1];   // Take start[1] as Y
        for (int i = 0; i < path.length(); i++) {   // Iterating in Path
            char direction = path.charAt(i);        // Take the current character in string as direction
            switch (direction) {                    // Switch case for traversing in a direction
                case 'N' -> y += 1;
                case 'S' -> y -= 1;
                case 'E' -> x += 1;
                case 'W' -> x -= 1;
            }
        }
        double xDistance = Math.pow(x - start[0], 2); // calculate the square of difference between final x and initial x
        double yDistance = Math.pow(y - start[1], 2); // calculate the square of difference between final y and initial y
        double distance = xDistance + yDistance; // add the square of difference of x and y
        return Math.sqrt(distance); // return the square root of the above distance which is Euclidean distance
    }
}

// Time Complexity = O(n);
// Space Complexity = O(1);