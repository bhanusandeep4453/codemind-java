import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int h,sp,s;
        h=x.nextInt();
        sp=x.nextInt();
        s=x.nextInt();
        if(h>50 && sp>60 && s>100){
            System.out.print("10");
        }else if(h>50 && sp>60){
            System.out.print("9");
        }else if(sp>60 && s>100){
            System.out.print("8");
        }else if(h>50 && s>100){
            System.out.print("7");
        }else if(h>50 || sp>60 || s>100){
            System.out.print("6");
        }else{
            System.out.print("5");
        }
    }
}