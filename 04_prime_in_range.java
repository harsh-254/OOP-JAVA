// print all prime between given range
import java.util.*;
public class primernge{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();


        for(int i=n1;i<=n2;i++)
        {
            boolean isprime = true;
            for(int div=2;div*div<=i;div++)
            {
                int r = i % div;
                if(r == 0)
                {
                    isprime = false;
                    break; 
                }
            }
            if(isprime == true){
                System.out.println(i);
            }
        }
    }
}
