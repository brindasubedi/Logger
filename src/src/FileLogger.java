package src;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileLogger implements Logger{
	@Override
	public void log(String data) {
		try
		{
                    
		    String filename= "C:\\Users\\bablu subedi\\Documents\\NetBeansProjects\\Logger\\src\\src\\log.txt";
		    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();
                    String time = dateFormat.format(date);
		    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
		    fw.write(time +":\t"+ data+ "\n");//appends the string to the file
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
	}
}


