import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n;
        n=x.nextInt();
        if(n%3==1){
            System.out.println("HUGE");
        }else if(n%3==0){
            System.out.println("NORMAL");
        }else{
            System.out.println("SMALL");
        }
    }
}