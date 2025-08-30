import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	Properties props;
	
	public ConfigReader() throws IOException
	{
		props = new Properties();
		
		try
		{
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Config.properties");
		props.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("config file not found" +e.getMessage());
		}
	}
	
	public String getBrowser() 
	{
        return props.getProperty("browser");
    }

    public String getBaseUrl() 
    {
        return props.getProperty("baseUrl");
    }
}
