package com.google.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class testConfigRead {
	public static HashMap<String, String> prjProperties = new HashMap<String, String>();

	public static HashMap<String, String> getConfigDetails() {
		try {


			File file = new File("C://Users//yashodeep.patil//workspace//GoogleExam//Resources//configuration.properties");

			FileInputStream fileinput = new FileInputStream(file);

			Properties prop = new Properties();

			prop.load(fileinput);

			for (String key : prop.stringPropertyNames()) {
				String value = prop.getProperty(key);
				prjProperties.put(key, value);

			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		return prjProperties;

	}
}
