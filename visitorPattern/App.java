package visitorPattern;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table("desk", 20));
        items.add(new Chair("chair1", 30));
        items.add(new Table("chair2", 25));

        double sum = 0;
        ShoppingCartVisitor shoppingCart = new ShoppingCart();

        for(ShoppingItem shoppingItem : items)
            sum = sum + shoppingItem.accept(shoppingCart);
        
        System.out.println(sum);
    }
}
