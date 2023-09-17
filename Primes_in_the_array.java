import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,c=0;
        n=x.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(int i:arr){
            if(prime(i)){
                c++;
            }
        }
        System.out.print(c);
    }
    public static boolean prime(int n){
        if(n==1)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}