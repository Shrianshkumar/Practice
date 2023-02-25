import java.util.*;
public class Lcm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1 % n2 !=0){
            int rem= n1 % n2;
            n1=n2;
            n2=rem;
        }
    int HCF=n2;
    int LCM = (on1 * on2) / HCF;
    System.out.println("LCM: " + LCM + " HCF: " + HCF);
    }
}

