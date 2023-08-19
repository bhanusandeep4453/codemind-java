import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,r,s=0;
        n=x.nextInt();
        while(n>0){
            r=n%10;
            if(s<r){
                s=r;
            }
            n=n/10;
        }
        System.out.print(s);
    }
}