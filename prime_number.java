import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,c=0,i;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.print("prime");
        }else{
            System.out.print("not a prime");
        }
    }
}