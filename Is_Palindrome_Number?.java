import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n;
        n=x.nextInt();
        System.out.print(p(n));
    }
    public static int p(int n){
        int r,t,s=0;
        t=n;
        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(t==s){
            return 2;
        }else{
            return 1;
        }
    }
}