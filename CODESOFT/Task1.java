import java.util.*;
class reuse2{
    void m2(){
         Scanner sc= new Scanner(System.in);
      int x=(int)(Math.random()*100);  
      int count=1;
      for(int i=1; i<=count; i++){
        System.out.print("Guess the Number ");
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
    }
}
public class Task1 {
    public static void main(String[] args) {
         reuse2 r2= new reuse2();
         r2.m2();
      
      
      int count2=1;
      Scanner sc= new Scanner(System.in);
     
      for(int i=1; i<=count2; i++){
        System.out.println("If you wamy to play again Press : 1 else Press : 0");
        int temp=sc.nextInt();
        if(temp==1){
            r2.m2();
        }
        else{
            System.out.println("Thank You");
            break;
            
        }
        count2++;
        
      }
      
    }
}
