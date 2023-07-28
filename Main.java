
//Question 2 (i)
//A private modifier ,

//Public access modifier allows the information in that particular class to be accessed in other class

//Protected modifier The  attributes are protected and it makes it possible to be inherited by other subclass



//Question 3 (i)
//a) Inheritance is the ability for a class(subclass) to inherit all attributes of another class(super class).
// Inheritance allows code re-usability.
// b) Encapsulation refers to hiding some data from the user, and leave the necessary code.
// c) Polymorphism ,poly means many, so polymorphism means many forms. For example a word run can have different meanings
// It allows the same method to be used for different purposes depending on what it is used with.
// d) Object refers to an instance of a class
// e) Constructor is used to initialize attributes of a class

//Question 4 (i)
// A class is used to store objects, we create objects in a class
//While an object is an instance of a class. objects are stored in a class


//Importing the required libraries
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Namyenya Doreen, Java Exam 2023! \n ");


//        Question 2: Restaurant
//        Creating the restaurant objects
        Restaurant restaurant1= new Restaurant("Katogo",30_000,2);
        Restaurant restaurant2= new Restaurant("Breakfast",40_000,3);
        Restaurant restaurant3= new Restaurant("Breakfast",25_000,1);

//        Adding items
        restaurant1.addMenuItems();
        restaurant2.addMenuItems();
        restaurant3.addMenuItems();
//         Printing the restaurant objects with the different menu items, prices and ratings
        System.out.println("**Display Restaurant1**: \n" + "Menu item:"+restaurant1.getMenuItems()
                +"\nPrice:" +restaurant1.getPrices()+"\nRatings:"+ restaurant1.getRatings());
        System.out.println("**Display Restaurant2**: \n" + "Menu item:"+restaurant2.getMenuItems()
                +"\nPrice:" +restaurant2.getPrices()+"\nRatings:"+ restaurant2.getRatings());
        System.out.println("**Display Restaurant3**: \n" + "Menu item:"+restaurant3.getMenuItems()
                +"\nPrice:" +restaurant3.getPrices()+"\nRatings:"+ restaurant3.getRatings());

//        Removing items
        restaurant3.removeMenuItems();



//Question 2(iii) STUDENT
//        Creating the student objects
        Student student1=new Student("Victory",90,"Java");
        Student student2=new Student("Dora",97,"Javascript");
        Student student3=new Student("Dina",99,"Python");
        Student student4=new Student("Holly",92,"Data science");

//       Adding the courses

        System.out.println("Displaying the added courses for the different students \n");
        System.out.println("Student1 :"+ student1.addCourses());
        System.out.println("Student2 :"+ student2.addCourses());
        System.out.println("Student3 :"+ student3.addCourses());
        System.out.println("Student4 :"+ student4.addCourses());



//        Question 4  (ii) PERSON
        //        Creating person objects
        Person person1= new Person(12,300_000);
        Person person2= new Person(52,600_000);
        Person person3= new Person(32,800_000);
        Person person4= new Person(42,1000_000);
        Person person5= new Person(22,500_000);

        System.out.println("Display person objects' ages and salaries");
        System.out.println("person1's age: "+ person1.getAge()+"\n Person 1' salary:"+person1.getSalary() );
        System.out.println("person2's age: "+ person2.getAge()+"\n Person 2' salary:"+person2.getSalary() );
        System.out.println("person3's age: "+ person3.getAge()+"\n Person 3' salary:"+person3.getSalary() );
        System.out.println("person4's age: "+ person4.getAge()+"\n Person 4' salary:"+person4.getSalary() );
        System.out.println("person5's age: "+ person5.getAge()+"\n Person 5' salary:"+person5.getSalary() );

      person1.setSalary(250_000);
        System.out.println("\n Person1's updated salary:"+ person1.getSalary());
      person3.addSalary(123_000);
        System.out.println("\n Person3's updated salary:"+ person3.getSalary());

//        Question 4(iii) Box class
//        Creating an instance of the box class
        Box box1= new Box (12.5f);

//        Getting the width of the box1 instance
        System.out.println("Box 1 width= "+ box1.getWidth());

//        Updating the width of box1 to a new value
        box1.setWidth(24f);
        System.out.println("Updated width of box1 ="+ box1.getWidth());


//        Question 3 (ii) VOTING MACHINE
        VotingMachine machine1= new VotingMachine("Vanessa","hey vote",30);
        VotingMachine machine2= new VotingMachine("Mbappe","dont vote",100);
       VotingMachine machine3= new VotingMachine("Putin","oh wow vote",10);

//       Adding candidates
        machine1.addCandidate();
        machine2.addCandidate();
//        Casting votes
        machine3.getCandidates();
//
        machine1.PrintResults("Bernard",10000);
        machine2.PrintResults("Juilan",2000);
        machine3.PrintResults("Gillian",200);

        System.out.println(" Printing results for a candidate:"+machine3.getCandidates());



















    }
}