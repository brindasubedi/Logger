package src;

public class LoggerFactory {
	public Logger getLog(String logType) {
		if(logType == null) {
			return null;
		}
		if(logType.equalsIgnoreCase("consolelogger")) {
			return new ConsoleLogger();
		}else if(logType.equalsIgnoreCase("filelogger")) {
			return new FileLogger();
		}
		return null;
	}
}
