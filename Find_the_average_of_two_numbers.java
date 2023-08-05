import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a,b;
        a=x.nextInt();
        b=x.nextInt();
        double sum,avg;
        sum=(a+b);
        avg=(sum/2);
        System.out.printf("%.4f",avg);
    }
}