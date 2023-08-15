import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i,j,t,ch=65;
        n=x.nextInt();
        for(i=n;i>=1;i--){
            //int ch=65;
            for(j=1;j<=i;j++){
                //char a=;
                System.out.print((char)(ch-1+i) + " ");
            }
            System.out.println();
        }
    }
}