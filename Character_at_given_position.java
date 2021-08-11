package String_Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Que1 {

	public static void main(String[] args) throws IOException {
	
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter string");
      String str=br.readLine();
      System.out.println("enter index");
      int index= Integer.parseInt(br.readLine());
      if(index>=0 && index <=str.length()-1)
      {	  
      System.out.println("Character at given index is:"+" "+str.charAt(index));
	  }
      else 
      {
    	  System.out.println("Invalid index");
      }
}
}
