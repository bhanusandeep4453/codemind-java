import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,c=0,ct=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n;i++){
            ct+=arr[i];
        }
        float avg=ct/(n*1.0f);
        System.out.printf("%.2f",avg);
    }
}