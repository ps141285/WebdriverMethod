package Session41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Reading_Properties_File 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream(".\\src\\TestData\\config.properties");
		
		Properties properties_obj=new Properties();
		properties_obj.load(file);
		
		String app_url=properties_obj.getProperty("appurl");
		String email=properties_obj.getProperty("Email");
		String pwd=properties_obj.getProperty("Password");
		String or_id=properties_obj.getProperty("OrderID");
		String cc=properties_obj.getProperty("CompanyCode");
		String location=properties_obj.getProperty("Location");
		
		System.out.println(app_url);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(or_id);
		System.out.println(cc);
		System.out.println(location);
		
		//Set<String>keys=properties_obj.stringPropertyNames();
		//System.out.println(keys);
		
		Set<Object>keys=properties_obj.keySet();
		System.out.println(keys);
		
		//reading all value from properties file
		Collection<Object>all_values=properties_obj.values();
		System.out.println(all_values);
		file.close();
		

	}

}
