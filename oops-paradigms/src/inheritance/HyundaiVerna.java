package inheritance;

//Child class or derived class or sub class

import inheritance.Car;

public class HyundaiVerna extends Car {
//    String brandName;
//    String yearOfMan;
//    int cc;
//    boolean isPetrol;
    boolean hasSunRoof;
    boolean isAutomatic;

    public HyundaiVerna(boolean hasSunRoof , boolean isAutomatic) {
        super();
        this.hasSunRoof = hasSunRoof;
        this.isAutomatic = isAutomatic;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return "HyundaiVerna{" +
                "hasSunRoof=" + hasSunRoof +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}
