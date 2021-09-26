package singletonPattern;
public enum Database {
    // Acquiring enum is thread safe
    INSTANCE;

    public void connect() {
        System.out.println("Connecting to Database...");
    }
    
    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
