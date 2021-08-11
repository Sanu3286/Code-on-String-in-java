package D1A1Q2;
import java.util.regex.*;
public class UserMainCode {

	public static int ipValidator(String ip) {
		// TODO Auto-generated method stub
       String s1="(\\d{1,2}| (0|1)\\"+"d{2}|2[0-4]\\d|25[0-5])";
       String s2 = s1+"\\."+s1+"\\."+s1+"\\."+s1 ;
       Pattern p = Pattern.compile(s2);
       
       if(ip==null)
       {
    	   return 0;
       }
       Matcher m=p.matcher(ip);
       if(m.matches()) 
        {
        	return 1;
        }
        else 
        {
            return 0;
        }
        
        
       
       
	
	}
	

}
