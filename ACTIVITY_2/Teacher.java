package ACTIVITY_2;

public class Teacher extends Person {
    private String Subject;


public Teacher(String name, int id, String Subject) {
    super(name, id); 
    this.Subject = Subject;
 } 

 public void display() {
    super.displayInfo();
    System.out.println("Subject: "+Subject);
 }
}
