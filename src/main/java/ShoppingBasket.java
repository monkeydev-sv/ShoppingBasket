import java.util.List;

public class ShoppingBasket {
    private final List<Item> items;
    public ShoppingBasket(List<Item> items) {
this.items = items;
    }

    public double getTotal(){
        if (items.isEmpty())
        return 0.0;
        return items.get(0).getUnitPrice();
    }
}
