package com.ict.tms.util;

import java.io.File;

public class AppUtil {

	public static String getTrainerProfileImagePath(String fileName) {
		String projectDir = System.getProperty("user.dir");
		return (projectDir + File.separator + "src/test/resources/images/"+fileName);
	}
}
