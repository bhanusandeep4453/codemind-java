import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,j,k;
        n=x.nextInt();
        for(i=1;i<=(n-1);i++){
            for(j=1;j<=i;j++){
                if(j==i||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("
");
        }
        for(k=1;k<=n;k++){
            System.out.print("*");
        }
    }
}