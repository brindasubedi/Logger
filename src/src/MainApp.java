package src;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Enter you log note: \n");
                
                        //ruk hai ! file ko location dina parxa ya :P 
		String logData = "";
		try {
			Scanner input = new Scanner(System.in);
			logData = input.nextLine();
		}catch(Exception e) {
			System.out.println(e);
		}
		//timi gara ta
			
	    LoggerFactory logFactory = new LoggerFactory();

	    //get an object of FileLooger and call its log method.
	    Logger logger1 = logFactory.getLog("filelogger");

	    //call log method of FileLooger
	    logger1.log(logData);

	    //get an object of ConsoleLogger and call its log method.
	    Logger logger2 = logFactory.getLog("consolelogger");

	    //call log method of ConsoleLogger
	    logger2.log(logData);

	      
	   }
}
