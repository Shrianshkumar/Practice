import java.util.*;

public class P{
    public static void main(String[] args){
        // write your code here
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
       // int count=0;
        for(int i=low;i<=high;i++){
            if(i % 2 != 0 || i==2){
                System.out.println(i);
            }
        }
    }
}
