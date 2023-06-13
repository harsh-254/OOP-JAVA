import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x = scn.nextInt();
            boolean isprime = true;
            for(int div=2;div*div<=x;div++)
            {
                int r = x % div;
                if(r==0)
                {
                    isprime= false;
                    break;
                }
            }
            if(isprime==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("non-prime");
            }
        }
    }
}
