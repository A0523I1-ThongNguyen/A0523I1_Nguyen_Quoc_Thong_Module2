package case_study.model;

public abstract class Person {
    private String id;
    private String fullName;
    private String date;
    private String gioitinh;
    private String cmnd;
    private String phone;
    private String email;

    public Person(String id, String fullName, String date, String gioitinh, String cmnd, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.date = date;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public Person() {

    }

    public String getId() {
        return id;
    }

    public void setId(String maNV) {
        id = maNV;
    }

    public String getFullName() {
        return fullName;
    }

    public void   setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "MaNV='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' + ","+
                '}';
    }
}
