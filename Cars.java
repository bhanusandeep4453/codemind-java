import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n1,n2,n3;
        n1=x.nextInt();
        n2=x.nextInt();
        n3=x.nextInt();
        if(n2<=n1){
            System.out.println("-1");
        }else{
            n2-=n1;
            n3=(n3/n2)+1;
            System.out.println(n3);
        }
    }
}