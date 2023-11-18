package com.sgtesting.IOPackage;

import java.io.File;

public class Assignment3WeekDayNameDemo {

	public static void main(String[] args) {
		// createFile();
		//	filecollections();
		subFolders();

	}

	private static void createFile() {
		try {
			String path = "D:\\Example\\Test\\DemoNew\\WeekdayName.txt";
			File f1 = new File(path);
			f1.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void filecollections() {
		try {
			File f1 = new File("D:\\Example\\Test\\DemoNew");
			File f2[] = f1.listFiles();
			for (int i = 0; i < f2.length; i++) {
				if (f2[i].isFile() == true) {
					String path = f2[i].getPath();
					System.out.println(path);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void subFolders()
	{
		try
		{
			File f1=new File("D:\\Example\\Test\\DemoNew\\");
			for(int i=1;i<=10;i++) {
				File f2=new File(f1,"Folder"+i);

				f2.mkdir();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}