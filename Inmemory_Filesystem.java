package comcast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Inmemory_Filesystem {

	String path ="folderpath";
	public static void main(String[] args) {
		
		//Create a folder
		//r
		
		
	}
	
		
	
	public void create_Folder(){
		// create 3 folders
		 int i =0;
		while(i!=2)
		{
			File f = new File(path+i);
				
		{
		if(!f.exists()){
		System.out.println("New Folder created");
		f.mkdirs();	
		}
		else
			{
			System.out.println("Folder already exists");
			}
		}
		}
		i++;
		}
		
		public void create_File(){
			String tdata = "This is a test";
			 //Create 3 new files    
		    int i=0;
		    while(i!=2)
		    {
		    	 File file = new File(path+ "/"+"file"+i);
		    	   
		    	   if (!file.exists())  
		    	   file.createNewFile();    
		    	   
		    		// Add content to file
		    		
		     FileWriter fw = new FileWriter(file.getAbsoluteFile());
		    		
		     BufferedWriter bw = new BufferedWriter(fw);
		     bw.write();
		     bw.close();
			 
		}
		}
}
