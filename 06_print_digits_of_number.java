// print all digits of number  ex 123456 then print 1  2  3  4  5  6 
import java.util.*;
public class dgtnum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt(),cnt=0;
        int dgt=n;
      
      // count number of digits 
        while(dgt != 0)
        {
            dgt /= 10;
            cnt++;
        }
        while(n != 0){
            cnt--;
            int div = (int)Math.pow(10, cnt);
            int num = n/div;
            System.out.print(num + " ");
            n = n % div;
        }
    }
}
