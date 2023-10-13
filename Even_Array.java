import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,f=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                f=1;
                break;
            }
        }
        if(f==1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}