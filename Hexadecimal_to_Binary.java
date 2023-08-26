import java.util.*;
public class h{
    public static void main(String[] Arg)
    {
        Scanner s=new Scanner(System.in);
        int s1=s.nextInt();
        for(int i=0;i<s1;i++)
        {
            String s2=s.next();
            int d = Integer.parseInt(s2,16);
            String k=Integer.toString(d,2);
            if(k.length()%4==0)
            System.out.println(k);
            else
            {
                int z=4-k.length()%4;
                for(int j=0;j<z;j++)
                k='0'+k;
                System.out.println(k);
            }
        }
    }
}