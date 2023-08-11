import java.util.*;
public class T1 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
    

      int x=(int)(Math.random()*100);  
      int count=1;
      for(int i=1; i<=count; i++){
        System.out.print("Enter your number ");
        int a=sc.nextInt();
        if(a==x){
            System.out.println("WELL DONE YOUR TIAR "+count);
            break;
        }
        else if(a<=x){
            System.out.println("**THIS IS LOWER TRY AGAIN**");
        }
        else if(a>=x){
            System.out.println("**THIS IS GREATEST TRY AGAIN**");
        }
        count++;
      }
      System.out.println(x);

    }
}
