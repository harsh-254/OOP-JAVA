  // count all digits of given number
import java.util.*;
public class cntdgits{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt(),cnt=0;
        while(n != 0)
        {
            n /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
