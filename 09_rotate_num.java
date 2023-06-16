import java.util.*;
public class nn {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int dgt=0,div=1,mul=1;

        int temp = n;
        while(temp != 0){
            temp /= 10;
            dgt++;
        }
        
        k = k % dgt;
        // for -ve rotation 5 digit number 
        // -1 (1 digits ko piche le jaye) = 4 digits ko aage lao 
        if(k<0){
            k = k + dgt;
        }

        for(int i=1;i<=dgt;i++){
            if(i<=k){
                div *=10;   
            }
            else{
                mul *=10;
            }
        }

        int rem = n % div;
        int quo = n / div;
        n = (rem*mul)+quo;
        System.out.println(n);
    }  
}
