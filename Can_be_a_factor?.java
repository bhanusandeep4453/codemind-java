import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a,b,t;
        t=x.nextInt();
        while(t!=0){
            a=x.nextInt();
            b=x.nextInt();
            if(a<=b/2||a==b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t-=1;
        }
    }
}