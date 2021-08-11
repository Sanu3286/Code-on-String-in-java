package D1A1Q1;

public class UserMainCode {

	public static int getSumOfSquaresOfDigits(int num) {
		// TODO Auto-generated method stub
		int sum=0,d;
		while(num>0)
		{
		d=num%10;
		sum=sum+(d*d);
		num=num/10;
		}
		return sum;
	}

}
