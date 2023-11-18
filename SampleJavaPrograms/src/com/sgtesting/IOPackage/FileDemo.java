package com.sgtesting.IOPackage;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		String path="D:\\Example\\Test\\Welcome.txt";
		File f1=new File(path);
        //Display the name of the file
		String name=f1.getName();
		System.out.println("File Name :"+name);
		//Display the path of the file
		String path1=f1.getAbsolutePath();
		System.out.println("File Name :"+path1);
		//Display the path of the file
		String path2=f1.getPath();
		System.out.println("File Name :"+name);
		//Display parent folder path
		String path3=f1.getParent();
		System.out.println("Parent file path :"+path3);
		//Verify,Is it a file
		boolean val1=f1.isFile();
		System.out.println("Is it a file ?:"+val1);
		//Verify,Is it a file ?
		boolean val2=f1.isDirectory();
		System.out.println("It is a folder ? :"+val2);
		//Read permission
		boolean v1=f1.canRead();
		System.out.println("Read permission :"+v1);
		//Write permission
		boolean v2=f1.canWrite();
		System.out.println("Write permission :"+v2);
		//Excute permission
		boolean v3=f1.canExecute();
		System.out.println("Excute permission :"+v3);
	}

}
