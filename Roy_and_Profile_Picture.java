import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int l,w,h,n;
        l=x.nextInt();
        n=x.nextInt();
        for(int i=1;i<=n;i++){
            w=x.nextInt();
            h=x.nextInt();
            if(w<l || h<l){
                System.out.println("UPLOAD ANOTHER");
            }else{
                if((w==l||w==h) && (w==h)){
                    System.out.println("ACCEPTED");
                }else{
                    System.out.println("CROP IT");
                }
            }
        }
    }
}