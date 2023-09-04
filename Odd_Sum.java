import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,os=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(int i:arr){
            if(i%2!=0){
                os+=i;
            }
        }
        System.out.print(os);
    }
}