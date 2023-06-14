import java.util.*;
public class digitsofnum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();

        // altenate of pow function we use this. 
        int temp = n;
        int div=1;
        while(temp > 10){
            temp = temp/10;
            div = div*10;
        }
        // System.out.println(div); to test above part


        // to print digits of number.
        while(div >= 1){
            int quo = n / div;
            int rem = n % div;

            System.out.println(quo);
            n = rem;
            div = div/10;
        }
    }
}
