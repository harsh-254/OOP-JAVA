import java.util.*;
public class even_odd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x = scn.nextInt();
            if(x%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
