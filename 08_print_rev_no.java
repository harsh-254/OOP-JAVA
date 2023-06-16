import java.util.*;
public class print_rev_no{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt(),inv=0;
        while(n != 0){
            int rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
    }
}
