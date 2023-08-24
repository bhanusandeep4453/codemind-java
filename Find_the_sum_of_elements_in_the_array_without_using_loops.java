import java.util.*;
public class bhanu {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n, i, sum = 0;
        n = x.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = x.nextInt();
        }
        System.out.println(sum(a, 0));
    }

    public static int sum(int[] arr, int ind) {
        if (arr.length <= ind) {
            return 0;
        }
        return arr[ind] + sum(arr, ind + 1);
    }
}
