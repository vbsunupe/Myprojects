package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;	
	public Properties configreader() throws IOException {

		try {
			File file =new File ("./src/test/resources/config/config.properties");	
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.getStackTrace();
		}

		return prop;

	}
}