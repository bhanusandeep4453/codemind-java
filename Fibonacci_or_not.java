import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,a=0,b=1,c=0;
        n=x.nextInt();
        while(c<n){
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}