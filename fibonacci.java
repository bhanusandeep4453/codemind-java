import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=0,b=1,c=0,n;
        n=x.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(c + " ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}