import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        double c;
        c=x.nextInt();
        double f;
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}