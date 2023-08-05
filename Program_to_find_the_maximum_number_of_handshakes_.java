import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a,b;
        a=x.nextInt();
        b=a*(a-1)/2;
        System.out.print(b);
    }
}