import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,s=0,f=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
            s+=arr[i];
        }
        int avg=s/n;
        for(i=0;i<n;i++){
            if(arr[i]==avg){
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.print("False");
        }else{
            System.out.print("True");
        }
    }
}