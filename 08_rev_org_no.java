import java.util.*;
public class rev_org_no{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt(),inv=0;
        while(n != 0){
            int rem = n%10;
            inv = rem + inv *10;
            n = n/10;
        }
        System.out.println(inv);
    }
}
