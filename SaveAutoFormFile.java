package org.andot.ADFile.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SaveAutoFormFile {
	/**
	 * 自定义表单存放方法
	 * @author andot
	 * @throws IOException 
	 * @date 2017-9-12 16:24:45
	 * 
	 * */
	public static boolean saveFile(InputStream stream,String path,String savefile) throws IOException{
		FileOutputStream fs=new FileOutputStream( path + savefile);
        System.out.println("自定义表单存放路径：------------"+path + savefile);
        byte[] buffer =new byte[1024*1024];
        int bytesum = 0;
        int byteread = 0; 
        try {
			while ((byteread=stream.read(buffer))!=-1)
			{
			  bytesum+=byteread;
			  fs.write(buffer,0,byteread);
			  fs.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} 
        fs.close();
        stream.close();
		return true;
	} 
}
