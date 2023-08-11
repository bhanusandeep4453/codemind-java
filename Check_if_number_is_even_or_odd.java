import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        if(n%2==0){
            System.out.printf("Even");
        }else{
            System.out.printf("Odd");
        }
    }
}