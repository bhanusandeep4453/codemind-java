import java.util.*;
public class main1{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,j,c1=0,c2=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}