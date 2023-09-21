import java.util.*;
public class bhanu{
    public static void main(String[] ags){
        Scanner x=new Scanner(System.in);
        int n,i;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        int k=x.nextInt();
        int c =0;
        for(i=0;i<k;i++){
            c+=arr[i];
        }
        System.out.print(c);
    }
}