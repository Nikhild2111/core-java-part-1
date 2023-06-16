public class Student {
    //properties or fields or attributes
    String name;
    int age;
    char div;
    int id;
    String collegename;




    //methods or behaviour or actions

    void study(){
        System.out.println(this.name + " is studying");
    }

    void play(){
        System.out.println(this.name + " is playing");
    }

    void commute(){
        System.out.println(this.name + " is commuting");
    }

}


class Example{


    public static void main(String[] args) {

        //Object is an entity of class
        //fields for nikhil
        Student nikhil = new Student();
        nikhil.name = "Nikhil";
        nikhil.age = 23;
        nikhil.id = 101;
        nikhil.div = 'A';
        nikhil.collegename = "Sai nirman college";

        //methods for nikhil
        nikhil.study();
        nikhil.play();
        nikhil.commute();

        Student sahil = new Student();
        sahil.name = "Sahil";
        sahil.age = 25;
        sahil.id = 102;
        sahil.div = 'B';
        sahil.collegename = "COE";

        sahil.study();
        sahil.play();
        sahil.commute();

    }
}
