import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,j,k;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            int a,b,c=0;
            a=x.nextInt();
            b=x.nextInt();
            for (j=a;j<=b;j++){
                if(j%10==2||j%10==3||j%10==9)
                c++;
            }
            System.out.println(c);
        }
    }
}