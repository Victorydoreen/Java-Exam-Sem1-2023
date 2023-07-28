
//Question 2(iii)
//Importing the required libraries

//java class Student
public class Student {
    private String name;
    private double grade;
    private String courses;


//    A constructor to initialize the attributes of student class
    public Student(String name, double grade, String courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    //    Getters and setters to help us in accessing different attributes and updating them
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
    public String addCourses(){
        return courses;
    }
    public String removeCourses(){
        return courses;
    }
}
