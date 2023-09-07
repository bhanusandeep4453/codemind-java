import java.util.*;
public class Bhanu {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,sum=0,c=0;
        n = x.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=x.nextInt();
            sum+=arr[i];
        }
        int avg=sum/n;
        for (int j:arr){
            if (j>=avg){
                c+=1;
            }
        }

        System.out.print(c);
    }
}