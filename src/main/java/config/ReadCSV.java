package config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	
	
	public void ReadfromCSV() throws IOException {
		
	String line = "";  
	String splitBy = ",";  
	String path = System.getProperty("user.dir");

	BufferedReader csvReader = new BufferedReader(new FileReader(path+"/src/main/resources/TestData.csv"));
	while ((line = csvReader.readLine()) != null) 
	{
	    String[] data = line.split(splitBy);
	    System.out.println("Data [Data 1" + data[0] + ",Data 2" + data[1] + ", Data 3=" + data[2] +"]"); 
	}
	csvReader.close();
	
	}
  

	public static void main(String[] args) throws IOException {
		
		ReadCSV rd = new ReadCSV();
		rd.ReadfromCSV();
	}
	
}
