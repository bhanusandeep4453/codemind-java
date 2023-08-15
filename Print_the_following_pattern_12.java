import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,j;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}