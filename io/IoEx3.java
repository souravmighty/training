package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoEx3 {
	
	public static void main(String[] args) {
		IoEx3 ex=new IoEx3();
		ex.execute();
		
	}
	
	public void execute()
	{
		InputStream is=null;
		OutputStream os=null;		
		try {
		is=System.in;
		File outputFile=new File("D:/folder/def.txt");//path of the file which has to be created.
		os=new FileOutputStream(outputFile);
		int readBytesCount;
		byte[] buffer=new byte[1000];
		BufferedInputStream bis=new BufferedInputStream(is);
		while((readBytesCount = is.read(buffer)) >=0 )
		{
			os.write(buffer, 0, readBytesCount);;
			System.out.write(buffer, 0, readBytesCount);
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
