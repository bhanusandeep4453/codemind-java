import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,c=0,a,b;
        n=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        a=x.nextInt();
        b=x.nextInt();
        for(int i:arr){
            if(i>=a && i<=b){
                c+=i;
            }
        }
        System.out.print(c);
    }
}