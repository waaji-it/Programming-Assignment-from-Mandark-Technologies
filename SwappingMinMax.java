import java.util.*;

public class SwappingMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < n; i++) {  //taking inputs of n elements in A and B arraylist
            A.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            B.add(sc.nextInt());
        }
        calculateMaxProduct(n, A, B);         // calling the function
    }

    public static void calculateMaxProduct(int n, ArrayList<Integer> A, ArrayList<Integer> B) {
        for (int i = 0; i < n; i++) {
            if (A.get(i) > B.get(i)) {         //swapping the elements if A[i]>B[i]
                int temp = A.get(i);
                A.set(i, B.get(i));
                B.set(i, temp);
            }
        }
        int ans;
        int maxA = A.get(0);
        int maxB = B.get(0);
        for (int i = 0; i < n; i++) {         //calculating the max element of A and B
            maxA = Math.max(maxA, A.get(i));
            maxB = Math.max(maxB, B.get(i));
        }
        ans = maxA * maxB;                   //calculate ans = product of maxA and MaxB
        System.out.println(ans);
    }
}

// Time Complexity = O(n);
// Space Complexity = O(n);