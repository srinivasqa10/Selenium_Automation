package DataDrivenTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
    public static void main(String[] args) throws IOException {
        //Create object of Properties file
        Properties propertiesobj = new Properties();

        //Loading properties file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
        propertiesobj.load(file);

        //Reading data from properties file
        String url = propertiesobj.getProperty("appurl");
        String email = propertiesobj.getProperty("email");
        String passw = propertiesobj.getProperty("password");
        String oId = propertiesobj.getProperty("orderid");
        String cID = propertiesobj.getProperty("customerid");

        System.out.println(url + " " + email+ " " +passw+ " " +cID+ " " +oId);

        //Reading all the keys from properties file

        Set<String> keys= propertiesobj.stringPropertyNames(); //this will get in SET Collection

        System.out.println(keys);

        //Another way to Read all the keys from properties file
        Set<Object> obj= propertiesobj.keySet(); // this will get in OBJECT
        System.out.println(obj);

        //Reading all the values from properties file
        Collection<Object> values = propertiesobj.values();
        System.out.println(values);
    }

}
