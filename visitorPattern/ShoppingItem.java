package visitorPattern;

public interface ShoppingItem {
    public double accept(ShoppingCartVisitor visitor); 
}
