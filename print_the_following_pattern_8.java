import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,j,k;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-2);j++){
                System.out.print(j);
            }
            for(k=n-3;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}