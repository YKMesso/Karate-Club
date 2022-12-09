package Store;

public class SalesRecord {
    
<<<<<<< Updated upstream
    public String date;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
=======
    protected String date;

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }


    @Override
    public String toString() {
>>>>>>> Stashed changes
        return super.toString();
    }
}
