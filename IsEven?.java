import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n,i;
        n=x.nextInt();
        System.out.print(even(n));
    }
    public static int even(int n){
        if(n%2==0){
            return 2;
        }else{
            return 1;
        }
    }
}