package Staff;

abstract class MemberStaff {
    protected int memberId;

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
