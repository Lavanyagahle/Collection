package com.collection;

import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File myFile=new File("D:\\DemoFolder\\courses.txt");
      if(myFile.createNewFile()) {
    	  System.out.println("File Created");
      }else {
    	  System.out.println("File already Exist");
      }
	}

}
