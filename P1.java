import java.util.*;

public class P1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
    int n=scn.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}