package D1A1Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ip");
		String ip=sc.nextLine();
		int t=UserMainCode.ipValidator(ip);
		if(t==1)
		{
			System.out.println("Valid");
		}
		else if(t==0)
		{
			System.out.println("Invalid");
		}

	}

}
