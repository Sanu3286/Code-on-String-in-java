package String_Inheritance;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Hello";
		String str2= "Hello";
        System.out.println(" before modification");
		if(str1==str2)
		{
			System.out.println("Both str1 and str1 point to same reference");
		}
		else {
			System.out.println("Both str1 and str1 point to different reference");
		}
        str1=str1+"ab";
        System.out.println("-----------------------------------------------------");

        System.out.println(" After modification");
        if(str1==str2)
        {
        	System.out.println(" After Both str1 and str1 point to same reference");	
        }
        else {
        	System.out.println("Both str1 and str1 point to different reference");
        }
        
        
	}

}
