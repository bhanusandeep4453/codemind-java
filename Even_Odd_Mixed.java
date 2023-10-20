import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,e=0,o=0,r;
        n=x.nextInt();
        while(n!=0){
            r=n%10;
            if(r%2==0){
                e++;
            }else{
                o++;
            }
            n=n/10;
        }
        if(e!=0 && o==0)
        System.out.print("Even");
        else if(e==0 && o!=0)
        System.out.print("Odd");
        else
        System.out.print("Mixed");
    }
}