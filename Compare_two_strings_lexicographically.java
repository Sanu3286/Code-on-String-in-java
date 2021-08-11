package String_Inheritance;

import java.util.Scanner;

public class Que3 {
	public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string1");
		String str1 = sc.nextLine();  
        System.out.println("enter string1");
        String str2 = sc.nextLine();
        int ans = str1.compareTo(str2);

        // Display the results of the comparison.
        if (ans < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (ans == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
}