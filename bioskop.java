import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
public class bioskop
{
    public static void main(String[] args)
     {
    SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date =new Date();	 
    System.out.println("***Welcome to Garox Cinema***");
    System.out.println("The new of place of Cinema ");
    Scanner myvar=new Scanner(System.in);
	String answer;
 do {
     System.out.println("1:Avengers EndGame.");
     System.out.println("2:Sherlock Holmes");
     System.out.println("3:Dr.Watson");
   System.out.println("Enter your choice from 1 to 3");
   int b;
   do{
   b=myvar.nextInt(); }
   while(b>3);
 
   
   switch (b)
    {
      case 1:
      System.out.println("Movie name: Avengers Endgame");
      System.out.println("Cost of 1 ticket:Rp 35.000 .");
      System.out.println("How many tickets do you want?");
      int c;
      c=myvar.nextInt();
      int d=35000*c;
      System.out.print("Enter amount of money: ");	  
	   int value1;
	    do{   
	    value1=myvar.nextInt();       		
		 System.out.println("Try Again: ");	
         } while(value1<d);	
        int kembalian1=value1-d;	
        System.out.println("Total Cost :" + "Rp " + d);			
	    System.out.println("Change given : " + "RP "+ kembalian1);	
		System.out.println("TIME : " + formatter.format(date));	
        System.out.println("****Thanks for choosing us ^_^");	
   
   break;
   case 2:
     System.out.println("Movie name:Sherlock Holmes");
      System.out.println("Cost of 1 ticket:Rp 25.000.");
      System.out.println("How many tickets do you want?");
      int e;
      e=myvar.nextInt();
      int f=25000*e;
      System.out.print("Enter amount of money: ");	  
	   int value2;
	   do{   
	    value2=myvar.nextInt();       		
		 System.out.println("Try Again: ");	
         } while(value2<f);	
        int kembalian2=value2-f;		
        System.out.println("Total Cost :" + "Rp " + f );			
	    System.out.println("Change given : " + "RP "+ kembalian2);	
		System.out.println("TIME : " + formatter.format(date));	
        System.out.println("****Thanks for choosing us ^_^");	
	 
   break;   
   case 3:
     System.out.println("Movie name: Dr.Watson");
      System.out.println("Cost of 1 ticket:Rp 30.000.");
      System.out.println("How many tickets do you want?");
      int g;
      g=myvar.nextInt();
      int h=30000*g;	
	   System.out.print("Enter amount of money: ");	   
	   int value3;
	   do{   
	    value3=myvar.nextInt();       		
		 System.out.println("Try Again: ");	
         } while(value3<h);	
        int kembalian3=value3-h;		 
        System.out.println("Total Cost :" + "Rp " + h );			
	    System.out.println("Change given : " + "RP "+ kembalian3);	
		System.out.println("TIME : " + formatter.format(date));	
        System.out.println("****Thanks for choosing us ^_^");	
   		break;	
	}
		System.out.println("-------------------------");		
	 System.out.println("do you want buy again? yes or no");
	 System.out.println("-------------------------");
         answer =myvar.next();	
		}
		while(answer.equals("yes"));
	}  	 
    }
 