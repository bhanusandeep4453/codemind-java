import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,d;
        n=x.nextInt();
        while(n>0){
            d=n%10;
            n=n/10;
            System.out.print(d);
        }
    }
}