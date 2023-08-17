import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,m;
        n=x.nextInt();
        m=x.nextInt();
        for(i=1;i<=m;i=i+2){
            int sq;
            sq=n*i;
            if(i<m)
            System.out.printf("%d x %d = %d
",n,i,sq);
            else
            System.out.printf("%d x %d = %d",n,i,sq);
        }
    }
}