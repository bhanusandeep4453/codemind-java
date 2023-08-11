import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        if(a<0){
            System.out.printf("Negative Number");
        }else{
            System.out.printf("Positive Number");
        }
    }
}