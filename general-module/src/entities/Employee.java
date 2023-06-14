package entities;

public class Employee {
    String name;
    College collegeName;
    int age;


    public Employee() {
        this.name = name;
        this.collegeName = collegeName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", collegeName=" + collegeName +
                ", age=" + age +
                '}';
    }
}
