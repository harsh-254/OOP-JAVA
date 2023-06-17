import java.util.*;
public class nn {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int lcm = (n1*n2);

        while(n1%n2 != 0){
            int rem = n1 % n2;

            n1=n2;
            n2=rem;
        }
        int gcd = n2;
        
        lcm = lcm/gcd;
        
        System.out.println("gcd is :" + gcd + "\nlcm is :"+lcm);
    }
}
