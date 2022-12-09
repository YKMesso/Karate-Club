package Store;

public class StockRequest{

    public enum OrderStatus {

        REQUEST_AWAITING_APPROVAL,
        REQUEST_DENIED,
        ODRER_PLACED,
        ORDER_COMPLETED

    }

    public void displayOrderStatus(Store.OrderStatus OS){
        System.out.println("Order Status: " + OS);
    }

    
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
        return ("Order for " + sItem.name +
                ", " + quantityRequested + " needed." 
                );
    }

}