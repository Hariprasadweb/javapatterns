package oops;

public class Employe {

    private int id;
    private String name;
    private double salary;
    private String city;
    private long pincode;

    public Employe() {
    }

    public Employe(int id, String name, double salary, String city, long pincode) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
