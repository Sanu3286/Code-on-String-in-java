package D1A1Q4;

public class UserMainCode {
   public static int countWords(String str, String word)
   {
	// split the string by spaces in a
	    String a[] = str.split(" ");
	  
	    // search for pattern in a
	    int count = 0;
	    for (int i = 0; i < a.length; i++) 
	    {
	    // if match found increase count
	    if (word.equals(a[i]))
	        count++;
	    }
	  
	    return count;
	}
   }
