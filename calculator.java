
import static java.lang.System.exit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rabia
 */
public class calculator {

    
    
    
    public static int Add (String a, String b)
{
	   int x = Integer.parseInt(a);
           int y = Integer.parseInt(b);
           int res1=0;
	   res1=x+y;
           System.out.println(x + " + " + y + " = " + res1);
         return res1;
       
}
    
    
  public static int Sub (String a, String b)
{
     int x = Integer.parseInt(a);
     int y = Integer.parseInt(b);
	int res=0;
        if(x>y) 
        {
	    res=x-y;
            System.out.println(x + " - " + y + " = " + res);
        }
         else if (y>x) 
        {
           res=y-x;
           System.out.println(y + " - " + x + " = " + res);
        }
          else
         {
            res=x-y;
            System.out.println(x + " - " + y + " = " + res);
         }
 return res;
}
    
     public static int Mul (String a, String b)
{
           int x = Integer.parseInt(a);
           int y = Integer.parseInt(b);	
          int res=0;
	 res=x*y;
         System.out.println(x + " * " + y + " = " + res);
        return res;
}
    
    public static int Div (String a, String b)
{
    
     int x = Integer.parseInt(a);
           int y = Integer.parseInt(b);
	int res=0;
        if(x>y) 
        {
	    res= x/y;
            System.out.println(x + " / " + y + " = " + res);
        }
         else if (y>x) 
        {
           res=y/x;
           System.out.println(y + " / " + x + " = " + res);
        }
          else
         {
            res=x/y;
            System.out.println(x + " / " + y + " = " + res);
         }

         return res;
}  
     
    public static boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
      
        return result;
    }
    
   
    public static int square (String p)
    {
          int y = Integer.parseInt(p);
        int res= y*y;
        System.out.println("res="+res);
        return res;
        
    }
    
    
    
    
    
    
    
    public static void main(String[] args)
{

	String a;
	String b;
	int opt;
	int ch;

	do
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.next();
		System.out.println("Enter seconf number: ");
		b = sc.next();
		System.out.println("Press 1 for addition ");
		System.out.println("Press 2 for subtraction ");
		System.out.println("Press 3 for multiplication ");
		System.out.println("Press 4 for division ");
		System.out.println("Press 5 for all operations ");
		System.out.println("Press 6 for is EVEN? ");
                System.out.println("Press 7 for Squaring ");
                System.out.println("Press 8 for exiting? ");
		opt = sc.nextInt();
		switch (opt)
		{
		case 1:
			Add(a, b);
			break;
		case 2:
			Sub(a, b);
			break;
		case 3:
			Mul(a, b);
			break;
		case 4:
			Div(a, b);
			break;
		case 5:
			Add(a, b);
			Sub(a, b);
			Mul(a, b);
			Div(a, b);
			break;
                        
                        
                case 6:
                        int x = Integer.parseInt(a);
			isEvenNumber(x);
                        
                        int y = Integer.parseInt(b);
			isEvenNumber(y);
			break;        
                        
		case 7:
                        square(a);
                        square(b);
			break;
                case 8:
                    exit(0);
                    break;
		default:
			System.out.println("Invalid option selected please try again");
			break;
		}
		System.out.println("To contnue press 1");
		ch = sc.nextInt();
	} while (ch == 1);
	System.out.println("Thankyou for using our service");
}

    
    
    
    
    
    
    
    
}
