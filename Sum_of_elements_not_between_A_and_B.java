import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int j,n,i,s=0,a,b;
        n=x.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
        a=x.nextInt();
        b=x.nextInt();
        for(j=0;j<n;j++)
        {
            if(arr[j]<a || arr[j]>b)
            {
                s+=arr[j];
            }
            //System.out.print(s);
        }
        System.out.print(s);
    }
}