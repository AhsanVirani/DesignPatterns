package singletonPattern;
public class DatabaseConnector {

	// Instance of the Class
	private static DatabaseConnector INSTANCE;

	// Private Constructor
	private DatabaseConnector(){}

	// Get Instance
	public static synchronized DatabaseConnector getInstance() {
		if(INSTANCE == null)
			INSTANCE = new DatabaseConnector();
		return INSTANCE;
	}

	public void connect() {
		System.out.println("Connecting to the Database...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}