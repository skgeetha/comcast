package comcast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Inmemory_Filesystem {

	String path ="folderpath";
	public static void main(String[] args) {
		
		//Create a folder
		//r
		
		
	}
	
		
	
	public void create_Folder(String name){
		// create 3 folders
		 int i =0;
		//while(i!=2)
		//{
			File f = new File(path+name);
				
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
	//	}
	//	i++;
		}
		
		public void create_File(String name) throws IOException{
			String tdata = "This is a test";
			 //Create 3 new files    
		  //  int i=0;
		   // while(i!=2)
		   // {
		    	 File file = new File(path+ "/"+"name");
		    	   
		    	   if (!file.exists()) { 
		    	   file.createNewFile();    
		    	   }
		    		// Add content to file
		    		
		     FileWriter fw = new FileWriter(file.getAbsoluteFile());
		    		
		     BufferedWriter bw = new BufferedWriter(fw);
		     bw.write(tdata);
		     bw.close();
			 
		//}
		}
		
		   public void read_File(String name) throws IOException{
			   
			   // To print the content from a file
			   @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(path +name));
			    for (String line; (line = br.readLine()) != null;) {
			        System.out.print(line);
			        }
		   }
		    
		public void copy_File(String src_dir,String src_file,String target_dir,String target_file){

			File source = new File(src_dir+src_file);
			File dest = new File(target_dir+target_file);
			try {
			    FileUtils.copyDirectory(source, dest);
			} catch (IOException e) {
			    e.printStackTrace();
			}
			
		}
		  
		public void search_file(String src_dir, String fname ){
			
			File directory = new File(src_dir);

			//  To get all the files from a directory
			File[] fList = directory.listFiles();

			for (File file : fList) {
			    if (file.isFile()) {
			    	
			    	if(file.getName().equals(fname)){
			           System.out.println(file.getAbsolutePath());
			       }
			    
			    }
			}
			
			
		}
}
