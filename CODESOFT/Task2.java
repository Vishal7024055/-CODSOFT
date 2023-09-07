import java.util.*;
class reuse{
    public void m1(){
Scanner sc = new Scanner(System.in);
      // System.out.println("How Many Subject ");
  int count=0;
  int sum=0;
  int subject=5;
  double percent=0.0;

System.out.println("**ENTER YOUR MARKS**");
ArrayList <String> al= new ArrayList<>();
al.add("Hindi");
al.add("English");
al.add("Math");
al.add("Science");
al.add("Computers");
for(int i=1; i<=subject; i++){
    System.out.print(al.get(count)+" Marks = ");
    int c=sc.nextInt();
    
         sum=sum+c;
         count++;
         
        }
        percent=sum/subject;
        
        System.out.println("***Your Totle Marks***");
        System.out.println("        "+sum);
        System.out.println("***Your Totle Percent***");
        System.out.println("        "+percent+"%");

        if(percent<=100 && percent>=60 && percent>100){
            System.out.println("***Your Grade Is***");
            System.out.println("      A grade");
        
        }
        else if(percent<=60 && percent>=40){
            System.out.println("***Your Grade Is***");
            System.out.println("      B Grade");
        }
        else if(percent<=40 && percent>=0) {
            System.out.println("***Your Grade Is***");
            System.out.println("       C grade");
        }

    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=1;
        reuse ru= new reuse();
        ru.m1();
        
        for(int i=1; i<=count; i++){
            System.out.println("You Check More Student Grade? If YES Press 1 If No Press 0");
            int temp=sc.nextInt();
              if(temp==1){
            ru.m1();                  
        }
        else{
            System.out.println("Thank You");
            break;
        }
        count++;
        }
          
     }
        
    }

