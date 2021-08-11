package String_Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que5 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter string");
    String str=br.readLine();
	System.out.println("enter integer");
	String str1=str;
	int integer= Integer.parseInt(br.readLine());
	int i=1;
	while(i<integer)
	{
		str=str+str1;
		i++;
	}
	 
	System.out.println(str);
	 
	}
}
