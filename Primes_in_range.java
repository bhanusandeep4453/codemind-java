import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,m,c=0;
        n=x.nextInt();
        m=x.nextInt();
        for(int i=n;i<=m;i++){
            if(prime(i)){
                c++;
            }
        }
        System.out.println(c);
    }
    public static boolean prime(int n){
        int c1=0;
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c1++;
            }
        }
        return c1==0;
    }
}