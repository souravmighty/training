package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoEx2 {
	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		IoEx2 ex=new IoEx2();
		ex.execute();
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println("program is finished in millis="+executionTime);
	}
	
	public void execute()
	{
		InputStream is=null;
		OutputStream os=null;		
		try {
		File inputFile=new File("D:/folder/abc.txt");//path of the file which to be copied.
		is=new FileInputStream(inputFile);
		File outputFile=new File("D:/folder/def.txt");//path of the file which has to be created.
		os=new FileOutputStream(outputFile);
		int read;
		while((read = is.read())>=0)
		{
			os.write(read);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try
			{
			if(is!=null) {
				is.close();
			}
			if(os!=null){
				os.close();
			System.out.println("File is copied successfully.");
			}
			}catch(Exception e)
			{
				System.out.println("Couldn't close the file properly");
			}
		}
	}
}
