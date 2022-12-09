package Store;

public class SalesRecord {
    
    private String date;
    protected int day;
    protected int month;
    protected int year;
    public StockItem sItem;

    public String getDate(){

        return date;
    }

    public void setDate(String date){

        this.date = date;
    }


    public class date {
        private int day;
        private int month;
        private int year;

        public date(int d, int m, int y) {
            this.day = d;
            this.month = m;
            this.year = y;
        }
    }

        @Override
        public String toString() {
            return ("Item: " + sItem.name +
                    "\n Purchased on " + this.day + "/" + this.month + "/" + this.year +
                    "\n Total: " + sItem.price);
        }



}
