import java.lang.Math;

public class Check {
   int IS_FULL_TIME=1;
   double  empCheck=Math.floor(Math.random() * 10)  %  2 ;
   public  void Check1(){
   if(empCheck== IS_FULL_TIME)
      System.out.println("Employee is present");
     else
        System.out.println("Employee is Absent");

    	  
   } 

}
