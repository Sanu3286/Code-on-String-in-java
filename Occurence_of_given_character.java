package String_Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("enter string");
	      String str=br.readLine();
	      System.out.println("enetr charater");
	      char ch= (char) br.read();
	      int i=0,count=0;
	      while(i<str.length())
	      {
	    	  if(str.charAt(i)==ch)
	    	  {
	    		  count++;
	    	  }
	        i++;
	      }
	      System.out.println("ocuurence of character"+" "+ch+" "+count);
	}
	

}
