import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int i,j,n;
        n=x.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}