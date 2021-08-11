package D1A1Q5;

import java.util.Scanner;

public class Main {
	public static void main(String a[])
	{
		String id,loc;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ");
		id=sc.nextLine();
		System.out.println("enter location");
		loc=sc.nextLine();
		String ans=UserMainCode.validateIDLocations(id,loc);
		System.out.println(ans);

		
	}
	

}
