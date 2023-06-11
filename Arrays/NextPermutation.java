import java.util.*;

/**
 * NextPermutation
 */
public class NextPermutation {

    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }

    public static List<Integer> nextGreaterPermutation(List<Integer> arr) {
        int n = arr.size();
        int i = n - 1;
        for (; i > 0; i--) {
            if (arr.get(i) > arr.get(i - 1)) {
                break;
            }
        }
        if (i == 0) {
            Collections.sort(arr);
        } else {
            int num = arr.get(i - 1);
            int max = Integer.MAX_VALUE;
            int index = -1;
            int j = i - 1;
            for (; i < n; i++) {
                int temp = arr.get(i);
                if (temp > num && temp <= max) {
                    max = temp;
                    index = i;
                }
            }
            arr.set(index, num);
            arr.set(j, max);
            Collections.sort(arr.subList(j + 1, n));
        }
        return arr;
    }
}