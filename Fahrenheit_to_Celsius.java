import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        double f,c;
        f=x.nextInt();
        c=((f-32)*5)/9;
        System.out.printf("%.2f",c);
    }
}