package nullPattern;

public class NullCustomer extends AbstractCustomer {

    @Override
    public String getCustomer() {
        return "No Customer with the given name exists in the database ...";
    }

    @Override
    public boolean isNull() {
        return true;
    }
    
}
