package builderPattern;

public class App {
    public static void main(String[] args) {
        Account account = new Account.Builder(1, "ahsan.virani@gmail.com").setName("AHSAN").build();
        System.out.println(account.getId() + " " + account.getEmail() + " " + account.getName());
    }
}
