import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,j,t;
        n=x.nextInt();
        for(i=1,t=65;i<=n;i++,t++){
            for(j=1;j<=n;j++){
                char a=(char)t;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}