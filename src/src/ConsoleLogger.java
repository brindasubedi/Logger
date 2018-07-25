package src;

public class ConsoleLogger implements Logger{
	
	@Override
	public void log(String data) {
		System.out.println(data+ "\n");
	}
}
