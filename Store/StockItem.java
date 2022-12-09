package Store;

public class StockItem {


    public String name;
    public double price;
    private Integer quantityInStock;
    private boolean needToOrder;
    protected enum  REQUEST_AWAITING_APPROVAL

    public String getName() {

        return name;
    }

     // Setter
     public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double price) {

        this.price = price;
    }
    
    public Integer getQuantityInStock() {

        return quantityInStock = 10;
    }

    // Setter
    public void setQuantityInStock(Integer quantityInStock) {

        this.quantityInStock = quantityInStock - 1;
    }

    public boolean needToOrder() {

        return needToOrder;
      }
    
      // Setter
      public void name(Boolean needToOrder) {

        this.needToOrder = needToOrder;
      }

    @Override
    public String toString() {

        return ("Name: " + name +
                ", Price: " + price +
                ", Quantity: " + quantityInStock +
                ". \n Order more stock? : " + needToOrder );
    }
}
