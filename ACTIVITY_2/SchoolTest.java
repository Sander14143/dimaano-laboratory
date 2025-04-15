package ACTIVITY_2;

public class SchoolTest {
    public static void main(String[] args) {
    
    
    Student student = new Student("Sander", 31261327, "First year college");
    Teacher teacher = new Teacher("Sir Chie", 12365128, "oop");
    Staff staff = new Staff("Ace", 41273123, "Librarian");

        System.out.println("Student Information:");
        student.display();
        System.out.println();
        System.out.println("Teacher Information:");
        teacher.display();
        System.out.println();
        System.out.println("Staff Information:");
        staff.displayInfo();
 } 
}
