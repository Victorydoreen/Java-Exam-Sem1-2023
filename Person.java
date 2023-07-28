public class Person {
    private int age;
    private double salary;

//    A constructor to initialize attributes of the person class
    public Person(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

//     Getters and setters to help us in accessing different attributes and updating them
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void addSalary(double amount){
        salary+=amount;
    }



}
