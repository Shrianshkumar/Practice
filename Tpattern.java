//Question from talentbattle
import java.util.*;

public class Tpattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int s=n-1;
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                System.out.print("\t");
               
            }
             s--;
            for(int k=1;k<=st;k++){
                System.out.print("*\t");
                
            }
            st+=2;
            System.out.println();
        }
    }
}