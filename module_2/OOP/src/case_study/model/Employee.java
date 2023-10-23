package case_study.model;

public class Employee extends Person {

    private String level;
    private String location;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String id, String fullName, String date, String gioitinh, String cmnd, String phone, String email, String level, String location, double salary) {
        super(id, fullName, date, gioitinh, cmnd, phone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String level, String location, double salary) {
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String testString(){
        return getLevel() + location;
    }

    @Override
    public String toString() {
//        super.toString()
        return "Employee{" + getId() + ", " + getFullName() + ", " +", "+getDate()+", "+ getGioitinh() +", "+getCmnd()+","+getPhone()+","+getEmail()+
                "level='" + getLevel() + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
