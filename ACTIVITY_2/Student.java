package ACTIVITY_2;

public class Student extends Person {
    private String GradeLevel;


 public Student(String name, int id, String GradeLevel) {
    super(name, id); 
    this.GradeLevel = GradeLevel;
} 

public void display() {
    super.displayInfo();
    System.out.println("Grade Level: "+GradeLevel);
 }
}