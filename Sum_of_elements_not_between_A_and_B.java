import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int j,n,c=0,a,b;
        n=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        a=x.nextInt();
        b=x.nextInt();
        for(j=0;j<n;j++){
            if(arr[j]<a || arr[j]>b){
                c+=arr[j];
            }
        }
        System.out.print(c);
    }
}