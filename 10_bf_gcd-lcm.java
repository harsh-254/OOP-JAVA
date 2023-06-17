import java.util.*;
public class gcdlcm{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int gcd=0;

        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        System.out.print(gcd);
    }
}
