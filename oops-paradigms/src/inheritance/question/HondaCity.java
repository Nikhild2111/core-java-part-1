package inheritance.question;

//extends/inheritance  ->Is a relationship -> Hondacity Is a Car
//composition -> Has a Relationship -> Hondacity has a Wheel
//Child class or derived class or Sub class

import inheritance.question.Car;
import inheritance.question.Wheel;

public class HondaCity extends Car {
//    String brandName;
//    String yearOfMan;
//    int cc;
//    boolean isPetrol;
    boolean hasSunRoof;
    boolean isAutoMatic;

    Wheel[] wheels;


    public HondaCity(boolean hasSunRoof, boolean isAutoMatic) {
        super("Honda", "2023", 1300, true);
        System.out.println(this.getClass().getName() + " Called ");
        this.hasSunRoof = hasSunRoof;
        this.isAutoMatic = isAutoMatic;
    }

    public HondaCity(String brandName, String yearOfMan, int cc, boolean isPetrol, boolean hasSunRoof, boolean isAutoMatic, Wheel[] wheels) {
        super(brandName, yearOfMan, cc, isPetrol);
        this.hasSunRoof = hasSunRoof;
        this.isAutoMatic = isAutoMatic;
        this.wheels = wheels;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public boolean isAutoMatic() {
        return isAutoMatic;
    }

    public void setAutoMatic(boolean autoMatic) {
        isAutoMatic = autoMatic;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    //to string represents object, this means it prints object's fields
    //if tostring method is not overridden then it will print ClassName@HashCode
    @Override
    public String toString() {
        return "HondaCity{" +
                "hasSunRoof=" + hasSunRoof +
                ", isAutoMatic=" + isAutoMatic +
                '}';
    }
}
