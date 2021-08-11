package D1A1Q3;

public class UserMainCode {
	
	public static void getFormatedString(String str)
	{
	String str1="";
	int i=1;
	int c=0;
	str1=str1+str.charAt(0);
	while(i<str.length())
	{
		if(str.charAt(i)==' '  && c==0)
		{
			str1=str.charAt(i+1)+"."+str1;
			c++;
		}
		else if(str.charAt(i)==' ' && c==1)
		{
			str1=str.substring(i+1,str.length())+" "+str1;
			
		}
			
		i++;
	}
		
		
		
	System.out.println(str1);	
	}

}