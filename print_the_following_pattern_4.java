import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,j;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j||j==(n+1)-i){
                    System.out.print("x");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}