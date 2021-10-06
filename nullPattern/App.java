package nullPattern;

public class App {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        System.out.println(customerFactory.getCustomer("Ahsan").getCustomer());
        System.out.println(customerFactory.getCustomer("Joe").getCustomer());
    }
}
