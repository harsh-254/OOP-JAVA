import java.util.*;
public class nn{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int f=2;f<=n;f++){ // f stands for factor 
            while(n%f == 0){
                System.out.print(f + " ");
                n = n/f;
            }
        }
    }
}