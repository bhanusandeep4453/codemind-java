import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int i,n,c=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n-2;i++){
            if(arr[i]%2==0 && arr[i+2]%2==0){
                if(arr[i+1]%2==0){
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}