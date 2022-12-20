package genericLib;
//2 prog.
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilleData {
	
	public String getData(String key) throws IOException { //make void to String and return 1:8 in video
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath); // path is already written in AutoConstant interface  
		p.load(fis);
		return p.getProperty(key);
		
	}

}
