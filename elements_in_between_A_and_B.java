import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,a,b,c=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        a=x.nextInt();
        b=x.nextInt();
        for(int i:arr){
            if(i>=a && i<=b){
                c=1;
                System.out.print(i+" ");
            }
        }
        if(c==0)
        System.out.print("-1");
    }
}