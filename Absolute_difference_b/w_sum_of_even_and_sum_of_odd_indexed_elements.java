import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,s2=0,s1=0;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<n;i++){
            if(i%2==0){
                s1+=arr[i];
            }else{
                s2+=arr[i];
            }
        }
        System.out.print(Math.abs(s1-s2));
    }
}