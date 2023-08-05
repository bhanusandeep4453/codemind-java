import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, b, c;
        a = x.nextInt();
        b = x.nextInt();
        c = x.nextInt();
        double s,area,tarea,ts;
        s=(a + b + c);
        ts=s/2;
        area=ts*(ts-a)*(ts-b)*(ts-c);
        tarea=Math.sqrt(area);
        System.out.printf("%.2f", tarea);
    }
}
