package com.collection;

import java.io.*;

public class Stream {
public static void main(String[] args) throws IOException {
	OutputStream os= new FileOutputStream("D:\\DemoFolder\\courses.txt");
	
		os.write(70);
		os.write(65);
		os.write(78);
		os.close();
		System.out.println("Successfully write in file");
}
}
