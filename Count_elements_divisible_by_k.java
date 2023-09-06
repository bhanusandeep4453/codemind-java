import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,k,c=0;
        n=x.nextInt();
        k=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(int i:arr){
            if(i%k==0){
                c+=1;
            }
        }
        System.out.print(c);
    }
}