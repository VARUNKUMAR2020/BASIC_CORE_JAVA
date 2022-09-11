package Basic_Java.core;
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
    }
}
