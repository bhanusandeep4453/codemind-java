import java.util.*;
public class Bhanu{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        double p,t,r,ci;
        p=x.nextInt();
        r=x.nextInt();
        t=x.nextInt();
        ci=p*(Math.pow((1+r/100),t));
        System.out.printf("%.2f",ci);
    }
}