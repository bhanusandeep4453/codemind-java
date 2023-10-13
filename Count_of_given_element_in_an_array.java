import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]=read.nextInt();
        }
        int z = read.nextInt();
        int flag=0;
        for (int i=0;i<n;i++) {
            if (arr[i]==z) {
                flag++;
            }
        }

        System.out.println(flag);
    }
}