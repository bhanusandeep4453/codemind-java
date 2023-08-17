import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int s=0,q,r,n;
        n=x.nextInt();
        q=n;
        while(q!=0){
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        if(s==n){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}