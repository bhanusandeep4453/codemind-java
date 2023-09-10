import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,k,c=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        k=x.nextInt();
        for(i=0;i<k;i++){
            c+=arr[i];
        }
        System.out.print(c);
    }
}