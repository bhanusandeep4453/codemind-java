import java.util.Scanner;
public class Bhanu{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            arr[i]=x.nextInt();
            sum+=arr[i];
        }
        int avg=sum/n;
        int c=0;
        for (int i=0;i<n;i++) {
            if(arr[i]<=avg) {
                c++;
            }
        }
        System.out.print(c);
    }
}