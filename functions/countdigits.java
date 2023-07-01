import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        
        int f = getDigitFrequency(n, d);
        
        System.out.println(f);
    }

    public static int getDigitFrequency(int num, int dig) {
        int cnt=0;
    
        while(num>0){
            int rem = num%10;
            if(rem == dig){
                cnt++;
            }    
            num=num/10;
        }
        
        return cnt;
    }
}
