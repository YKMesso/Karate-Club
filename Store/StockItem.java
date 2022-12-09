package Store;

public class StockItem {
<<<<<<< Updated upstream
        
public String name;
private Double price;
private int quantityInStock;
private boolean needToOrder;

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString(" " + name + price);
}

=======

    private String name;
    private double price;
    private Integer quantityInStock;
    private boolean needToOrder;

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
        return quantityInStock;
    }

    // Setter
    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
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

        return super.toString();
    }
>>>>>>> Stashed changes
}
