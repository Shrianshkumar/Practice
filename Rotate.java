import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here 
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     
     //to check number of digits
     int temp=n;
     int nod=0;
     while(temp > 0){
         temp/=10;
         nod++;
     }
     
      k %=nod;
      
      //to convert negative rotation to positive
      if(k < 0){
          k += nod;
      }
     //to get divisor and multiplier
     int div=1;
     int mul=1;
     for(int i=1;i <=nod; i++){
         if(i <= k){
             div *= 10;
         }else{
             mul *=10;
         }
     }
     //for qoutient
     int q=n / div;
     //for remainder
     int r= n % div;
     int rot=r * mul + q;
     System.out.println(rot);
    }
   }