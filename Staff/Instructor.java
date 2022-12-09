package Staff;

public class instructor
        extends MemberStaff {
    private String name;
    public Boolean publishGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
