package io;

import java.io.File;

public class IoEx1 {
	
	public static void main(String[] args) {
		String path="D:/folder/abc.txt";
		File file=new File(path);
		System.out.println("is dir="+file.isDirectory());
		System.out.println("is file="+file.isFile());
		System.out.println("is hidden="+file.isHidden());
		if(file.isDirectory())
		{
			String[] files=file.list();
			for(String f:files)
			{
				System.out.println(f);
			}
		}
		File dirToBeCreated=new File("D:/folder/new1/abc");
		boolean created=dirToBeCreated.mkdir();
		System.out.println("dir create="+created);
		
	}

}
