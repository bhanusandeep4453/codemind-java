import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int j,n,i,s=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        int a=x.nextInt();
        int b=x.nextInt();
        boolean found = false;
        for(j=0;j<n;j++){
            if(arr[j]<a || arr[j]>b){
                System.out.print(arr[j]+" ");
                s=1;
            }
        }
        if(s==0){
            System.out.print("-1");
        }
        
    }
}