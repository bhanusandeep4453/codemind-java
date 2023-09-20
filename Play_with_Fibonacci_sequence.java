import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=0,b=1,c=0,n,j;
        n=x.nextInt();
        System.out.print(a+" "+b+" ");
        for(j=3;j<=n;j++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}