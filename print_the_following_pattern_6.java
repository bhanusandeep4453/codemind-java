import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int i,j;
        int n=x.nextInt();
        for (i=n;i>=1;i--){
            for (j=n;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}