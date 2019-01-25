package edu.bank.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfiguration {
	 public static Properties loadProperties(String resourceFileName) throws IOException {
	        Properties configuration = new Properties();
	        InputStream inputStream = AppConfiguration.class
	          .getClassLoader()
	          .getResourceAsStream(resourceFileName);
	        configuration.load(inputStream);
	        inputStream.close();
	        return configuration;
	    }
}
