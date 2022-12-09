package Member;

class Student {
    public String name;
    public int age;
    public Belt_TYPE belt = Belt_TYPE.WHITE_TYPE;
    private Boolean payment = false;
    private String paymentType;

    //Constructor
    Student(String name, int age, Belt_TYPE belt) {
        this.name = name;
        this.age = age;
        this.belt = Belt_TYPE.WHITE_TYPE;
    }

    //property
    // public Course course;

    public Boolean getPayment() {
        return payment;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", belt=" + belt + ", payment=" + payment + ", paymentType="
                + paymentType + "]";
    }

}