import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int i,n,s=0;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            s=s+i;
        }
        System.out.print(s);
    }
}