package Store;

public class StockRequest {
    
    public int quantityRequested;
    public boolean orderStatus;

    public StockItem sItem;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString("Order for " + sItem.name);
    }

}