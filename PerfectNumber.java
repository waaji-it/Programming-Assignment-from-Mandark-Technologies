import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  // Using Scanner class to get input from user
        int n=sc.nextInt();                 // taking input from user
        System.out.println(isPerfect(n));   // call that function and print the answer.

    }
    public static boolean isPerfect(int n) {
        int sum = 1;                        // initialize sum to 1, as 1 is always a divisor of any number
        for (int i = 2; i*i <= n; i++) {    // loop from 2 to sqrt(n)
            if (n % i == 0) {               // check if i is a divisor of n
                if (i*i != n)               // if i is not the square root of n,
                    sum += i + n/i;         // add i and n/i to the sum
                else
                    sum += i;              // else i is the square root of n, add i to the sum
            }
        }
        return sum == n;                   // return true if sum of divisors equals n, else return false
    }
}

// Time Complexity = O(sqrt(n))
// Space Complexity = O(1)

