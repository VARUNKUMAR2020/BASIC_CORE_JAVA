package Basic_Java.core;
import java.util.*;
public class java_core 
{
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO BASICS CORE JAVA PROGRAM" );
        
        
        System.out.println( "COIN FLIP" );
        double T=0;
		double H=0;
		for(int i=1;i<=10;i++)
		{
			double Flip=Math.random();
			System.out.println("coin "+Flip);
			if(Flip < 0.5) 
			{
				T++;
			}
			else 
			{
				H++;
		    }
		}
		System.out.println("head"+H);
		double percentageheads=(H/10)*100;
		double percentagetails=(T/10)*100;
		System.out.println("heads percentage is "+percentageheads);
		System.out.println("tails percentage is "+percentagetails);
	    System.out.println( " " );
	    System.out.println( " " );
	    
	    
	    System.out.println( "TO CHECK LEAP YEAR OR NOT " );
		Scanner Sc = new Scanner(System. in);
		System. out. print("Enter the year you want to check: ");
		int year = Sc. nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year+" is a leap year");
		}
		else 
		{
			System.out.println(year+" is not a leap year");
        }
		System.out.println( " " );
	    System.out.println( " " );
	    
	    System.out.println( "TO GET REMINDER AND QUOTIENT " );
	    Scanner S = new Scanner(System. in);
		System. out. print("Enter the divident number: ");
		int dd = S. nextInt();
		System. out. print("Enter the divisor number: ");
		int di= S. nextInt();
		if(di==0)
		{
			System.out.println("Enter valid number");
		}
		else 
		{
			int remainder= dd%di;
			int quotient=dd/di;
		
		
		System.out.println(remainder+" is a remainder");
		System.out.println(quotient+" is a quotient");
		}
		System.out.println( " " );
	    System.out.println( " " );
	    System.out.println("TO FIND THE FACTOR OF THE NUMBER ");
	    Scanner N = new Scanner(System.in);
	    System.out.println("Enter the number to find the factor: ");
	    int f = N.nextInt();
	    System.out.println("Factor of " + f + " are: ");
	    for(int i=1;i<=f;++i)
	    	{
	    		if(f  %i == 0);
	    		{
	    			System.out.println(i + " ");
	    		}
	    		
	    	}
	    System.out.println( " " );
	    System.out.println( " " );
	    System.out.println("TO FIND POWER OF THE NUMBER ");
	    Scanner P= new Scanner(System.in);
	    System.out.println("Enter the number to find the power: ");
	    int p = N.nextInt();
	    System.out.println("Power of 2 of the number  " + p + " are: ");
	    for(int a=0;a<=p;a++)
	    {
	    	int b=2;
	    }
	    System.out.println(Math.pow(2, p));
	    System.out.println( " " );
	    System.out.println( " " );
	    Scanner v=new Scanner(System.in);
		System.out.println("Enter An Alphabet ");
		char letter=v.next().charAt(0);
		if(letter=='a' || letter=='e' ||letter=='i' ||letter=='o' ||letter=='u' ) {
			System.out.println(letter+" is a Vowel");
		}
		else
			System.out.println(letter+" is a Consonent");
      }
	}

