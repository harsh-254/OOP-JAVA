// print all digits of number  ex 123456 then print 1  2  3  4  5  6 
import java.util.*;
public class digitprint{
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
        int div = (int)Math.pow(10, cnt-1); // bca cnt gives no of digits bt we need no of digits-1
        while(div >= 1){
            int num = n/div;
            System.out.print(num + " ");
            n = n % div;
            div/=10;
        }
    }
}
