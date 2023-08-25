import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int t,a,b,c;
        t=x.nextInt();
        while(t!=0){
            a=x.nextInt();
            b=x.nextInt();
            c=x.nextInt();
            if(a+b<c||b+c<a||c+a<b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t-=1;
        }
    }
}