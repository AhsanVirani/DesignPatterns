package singletonPattern;

public class App {
	public static void main(String[] args) {

		DatabaseConnector o1 = DatabaseConnector.getInstance();
		DatabaseConnector o2 = DatabaseConnector.getInstance();
		if(o1 == o2)
			System.out.println("Hello World");

		Database.INSTANCE.connect();
		Database.INSTANCE.disconnect();
	}
}

