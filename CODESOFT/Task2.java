import java.util.*;
public class Task2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("How Many Subject ");
  int count=1;
  int sum=0;
  int subject=sc.nextInt();
  double percent=0.0;
 


System.out.println("**ENTER YOUR MARKS**");
for(int i=1; i<=subject; i++){
    System.out.print("Subject "+count+" Enter ");
    int c=sc.nextInt();
    
         sum=sum+c;
         count++;
         
        }
        percent=sum/subject;
        
        System.out.println("**Your Totle Marks="+sum);
        System.out.println("**Your Totle Percent= "+percent+"%");

        if(percent<=100 && percent>=60 && percent>100){
            System.out.println("***Your Grade Is***");
            System.out.println("A grade");
        
        }
        else if(percent<=60 && percent>=40){
            System.out.println("***Your Grade Is***");
            System.out.println("B Grade");
        }
        else if(percent<=40 && percent>=0) {
            System.out.println("***Your Grade Is***");
            System.out.println("C grade");
        }
     }
        
    }

