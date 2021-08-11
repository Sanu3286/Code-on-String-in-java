package String_Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("enter string");
	      String str=br.readLine();
	      int l= str.length();
	      int l1=l-1;
	      int i=0,f=1;
	      while(i<l/2)
	      {
	    	  if(str.charAt(i)!=str.charAt(l1))
	    	  {
	    		  i++;
	    	      l1--;
	    	      f=0;
	    	  }
	    	  i++;
    	      l1--;
	      }
	      if(f==1)
	      {
	    	  System.out.println("Pallindrom");
	      }
	      else
	      {
	    	  System.out.println("Not pallindrom");
	      }
	}

}
