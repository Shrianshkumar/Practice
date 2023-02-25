import java.util.*;
public class I {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*\t");
                } 
            }else{
                for(int j=1;j<=n/2;j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=1;j++){
                    System.out.print("*");
                } 
            }
            System.out.println();  
        }
    }
}
