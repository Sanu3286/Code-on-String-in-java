package D1A1Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int ans=UserMainCode.getSumOfSquaresOfDigits(n);
		System.out.println(ans);
		sc.close();

	}

}
