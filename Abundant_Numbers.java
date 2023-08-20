import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,s=0;
        n=x.nextInt();
        for(i=1;i<=n/2;i++){
            if(n%i==0){
                s=s+i;
            }
        }
        if(s>n){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}