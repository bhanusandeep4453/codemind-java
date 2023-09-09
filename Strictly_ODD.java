import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,c=0,c1=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n;i++){
            if(i%2!=0 && arr[i]%2!=0){
                c++;
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]%2!=0){
                c1++;
            }
        }
        if(c==c1){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}