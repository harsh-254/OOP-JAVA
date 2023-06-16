import java.util.*;
public class invofnum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int inv=0,pos=0;
        
        while(n>0){
            int rem = n % 10;
            int quo = n/10;
            pos++;

            inv += (pos * ((int)Math.pow(10,rem-1)));

            n = quo;
        }
        System.out.println(inv);
    }
}
