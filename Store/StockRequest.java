package Store;

<<<<<<< Updated upstream
public class StockRequest {
    
    public int quantityRequested;
    public boolean orderStatus;

    public StockItem sItem;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString("Order for " + sItem.name);
=======
public class StockRequest implements OrderStatus{
    
    public int quantityRequested;
    public OrderStatus OS;

    public StockItem sItem;

    public int getQuantityRequested(){
        return quantityRequested;
    }

    public void setQuantityRequested(int quantityRequested){
        this.quantityRequested = quantityRequested;
    }

    @Override
    public String toString() {
        return super.toString("Order for " + sItem.name + sItem.price );
>>>>>>> Stashed changes
    }

}