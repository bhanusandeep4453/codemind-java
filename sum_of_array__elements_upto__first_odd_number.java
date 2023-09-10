import java.util.Scanner;
public class bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] arr=new int[n];
        int s=0;
        for (int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        
        for(int i:arr){
            if(i%2!=0){
                break;
            }
            s+=i;
        }
        System.out.println(s);
    }
}