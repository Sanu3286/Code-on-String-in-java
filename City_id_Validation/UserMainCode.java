package D1A1Q5;

public class UserMainCode {
	
	public static String validateIDLocations(String id, String loc)
	{
		String rt,id1,loc1,num;
		int l=0,d=1;
		id1=id.substring(4,7);
		loc1 = loc.substring(0,3);
		if(loc1.equals(id1));
		{
		l=1;
		}

		for(int i=id.length()-1;i>=id.length()-4;i--)
		{   
			char ch=id.charAt(i);
			if(!(ch>='0' && ch<='9') )
					{
				     d=0;
					}
		}
		if(l==1 && d==1)
		{
			rt="Valid id";
		}
		else 
		{
			rt="Invalid id";
		}
		return rt;
	}
}
		
		
		
		
		
		
	