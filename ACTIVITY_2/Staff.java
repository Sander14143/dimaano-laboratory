package ACTIVITY_2;

public class Staff extends Person {
    private String Department;

 public Staff(String name, int id, String Department) {
    super(name, id); 
    this.Department = Department;
 } 
 
 public void display() {
    super.displayInfo();
    System.out.println("Grade Level: "+Department);
 }
}