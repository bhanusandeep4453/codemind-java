import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int l,r,k,c=0;
        l=x.nextInt();
        r=x.nextInt();
        k=x.nextInt();
        for(int i=l;i<=r;i++){
            if(i%k==0){
                c++;
            }
        }
        System.out.print(c);
    }
}