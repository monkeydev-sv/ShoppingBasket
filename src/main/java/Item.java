public class Item{
    private final double unitPrice;
    private final double quantity;
    public Item(double unitPrice, int quantity){
        this.unitPrice =unitPrice;
        this.quantity=quantity;

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantaty() {
        return quantity;
    }
}
