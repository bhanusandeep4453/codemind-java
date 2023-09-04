import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,es=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n;i++){
            if(i%2==0){
                es+=arr[i];
            }
        }
        System.out.print(es);
    }
}