package comcast;
import org.apache.http.Consts;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Memes_rank {
	
	      

		public static void main(String[] args) throws ParseException {
	    	 
	        String S_file = "Source file name.json";
	        String key = "memes";
	        
	        /*
	         * 1.Sort the file with key
	         * 2.Update with lulz
	         * 
	         */
	        JSONArray memes_sortlist = sortMemes(S_file,key);
	                  
	        lulz_append(S_file, memes_sortlist);
	    }

	    	     
	    public static JSONArray sortMemes(String S_file,String key)
	            throws ParseException {

	        JSONArray memes = null;
	        JSONArray memes_sortlist = new JSONArray();

	        try {
	            FileReader reader = new FileReader(S_file);
	            JSONParser jsonParser = new JSONParser();
	            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

	            memes = (JSONArray) jsonObject.get(key);

	            ArrayList<String> list = new ArrayList<String>();

	            for (String meme : (Iterable<String>) memes) {
	                list.add(meme.toString());
	            }

	            Collections.sort(list);

	            for (String element : list) {
	                memes_sortlist.add(element);
	            

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return memes_sortlist;
	    }
	    
	  
	     // Add lulz and update.
	     
	     
	    private static void lulz_append(
	            final String s_file,
	            final JSONArray memes_sortlist) {

	     
	        int high= 10;
	        int low = 1;
	        int lulz = 5;

	        JSONArray arr = new JSONArray();
	        HashMap<String, JSONObject> map = new HashMap<String, JSONObject>();
	        for (int i = 0; i < 10; i++) {
	            lulz = (int) (Math.random() * ((high - low) + 1)
	                    + low);
	            JSONObject json = new JSONObject();
	            json.put("meme", memes_sortlist.get(i));
	            json.put("lulz", lulz);
	            map.put("json" + i, json);
	            arr.add(map.get("json" + i));
	        }
	        System.out.println("The json string is now " + arr.toString());

	        FileWriter file = null;

	        try {
	            file = new FileWriter(s_file);
	            file.write(arr.toJSONString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                file.flush();
	                file.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

