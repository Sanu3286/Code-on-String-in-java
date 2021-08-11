package D1A1Q4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter String ");
		String str =sc.nextLine();
		System.out.println("enter word ");
		String word =sc.nextLine();
		int count=UserMainCode.countWords(str,word);
		System.out.println("occurence of word"+"  "+count);
		
		
		
		
		

	}

}
