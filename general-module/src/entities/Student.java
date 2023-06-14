package entities;

public class Student {
    String name;
    College collegeName;
    int id;
    Address address;

    public Student() {
    }

    public Student(String name, College collegeName, int id, Address address) {
        this.name = name;
        this.collegeName = collegeName;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(College collegeName) {
        this.collegeName = collegeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", collegeName=" + collegeName +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
