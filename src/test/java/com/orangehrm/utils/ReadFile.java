package com.orangehrm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadFile {
	public static Properties ReadFileData(String filename) throws Exception {
		
		File f=new File(filename);
		FileInputStream fi=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fi);
		return prop;
		
	}
}
