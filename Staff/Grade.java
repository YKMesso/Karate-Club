package staff;

public class Grade {
    private String name;
    public String beltAttempted;
    public Boolean pass;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Grade =" +
                "name =" + name +
                ", beltAttempted =" + beltAttempted +
                ", pass =" + pass +
                '}';
    }

}