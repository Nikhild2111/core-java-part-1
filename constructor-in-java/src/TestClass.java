
class TestClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.displayObjectAndMessage();

        Employee employee2 = new Employee();
        employee2.displayObjectAndMessage();

        Employee employee3 = new Employee();
        employee3.displayObjectAndMessage();

        Employee employee4 = new Employee("Sahil",104,20000,"Male","Accenture","Pune",9175874606L);
        employee4.displayObjectAndMessage();

        Employee employee5 = new Employee("Prasad",103,40000,"male","Ms","Pune",7020226746L);
        employee5.displayObjectAndMessage();

        Employee employee6 = new Employee(employee5);
        employee6.displayObjectAndMessage();

        Employee employee7 = new Employee("Shubham",104,120000);
        employee7.displayObjectAndMessage();
    }
}