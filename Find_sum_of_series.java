import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,j;
        double s=0;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            s+=(1.0/i);
        }
        System.out.printf("%.2f",s);
    }
}