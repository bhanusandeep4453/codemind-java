import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,a,b;
        n=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        a=x.nextInt();
        b=x.nextInt();
        int max=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        }
        System.out.print(max);
    }
}