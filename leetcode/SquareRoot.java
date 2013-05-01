
public class SquareRoot {
	
	public double sqrt(double num)
	{
		double ACCURACY = 0.00001;
		double lower, upper, guess;
		if(num < 0) return -1;
		if(num == 0 || num == 1) return num;
		
		if(num <1)
		{
			lower = num;
			upper = 1;
		}else
		{
			lower = 1;
			upper = num;
		}
		
		while(upper-lower > ACCURACY)
		{
			
			guess = (lower + upper)/2;
			if( guess * guess > num)
				upper = guess;
			else
				lower = guess;
		}
		
		return (lower + upper)/2;
	}

}
