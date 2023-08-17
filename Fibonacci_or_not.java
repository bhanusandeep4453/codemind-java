import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=0,b=1,c=0,n;
        n=x.nextInt();
        //b=x.nextInt();
        //c=x.nextInt();
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        if(c==n){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}