package entities;

public class College {
    String name;
    int numOfStaff;
    int numOfStudent;

    public College() {
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumOfStaff() {
        return numOfStaff;
    }

    public void setNumOfStaff(int numOfStaff) {
        this.numOfStaff = numOfStaff;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", numOfStaff=" + numOfStaff +
                ", numOfStudent=" + numOfStudent +
                '}';
    }
}
