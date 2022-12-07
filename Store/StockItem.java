package Store;

public class StockItem {
        
public String name;
private Double price;
private int quantityInStock;
private boolean needToOrder;

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString(" " + name + price);
}

}
