import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int a,i;
        a=x.nextInt();
        for(i=1;i<=a;i++){
            String b,c;
            b=x.next();
            int d=Integer.parseInt(b,2);
            c=Integer.toString(d,8);
            System.out.println(c);
        }
    }
}