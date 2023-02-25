import java.util.*;
public class Triplet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int g=0, sq=0;
        if(n1 > n2 && n1 > n3){
            g=n1;
            boolean check=((n2 * n2 )+(n3 * n3)== (g * g));
            System.out.println(check);
        } else if(n2 > n1 && n2 > n3){
            g=n2;
            boolean check=((n1 * n1) + (n3 * n3)== (g * g));
            System.out.println(check);
        }else{
            g=n3;
            boolean check=((n1 * n1) + (n2 * n2)== (g * g));
            System.out.println(check);
        }

    }
}