import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,j;
        int s=0,s1=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n/2;i++){
            s+=arr[i];
        }
        for(j=n/2;j<n;j++){
            s1+=arr[j];
        }
        System.out.print(Math.abs(s-s1));
    }
}