import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,c=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]%2==0){
                c++;
            }
        }
        if(c==n){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}