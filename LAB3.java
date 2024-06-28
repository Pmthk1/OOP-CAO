class Student {
    String Name;
    String Student_code;
    Course[] Course;

    void ShowDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Student Code: " + Student_code);
        System.out.print("Courses: ");
        for (Course course : Course) {
            System.out.print(course.Course_Name + ", ");
        }
        System.out.println();
    }
}

class Course {
    String Course_code;
    String Course_Name;
    int Creadit;

    void ShowDetails() {
        System.out.println("Course Code: " + Course_code);
        System.out.println("Course Name: " + Course_Name);
        System.out.println("Credits: " + Creadit);
    }
}

public class LAB3 {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.Name = "Pluem1";
        student1.Student_code = "S001";
        student1.Course = new Course[3];
        student1.Course[0] = new Course();
        student1.Course[0].Course_code = "C001";
        student1.Course[0].Course_Name = "English";
        student1.Course[0].Creadit = 1;
        student1.Course[1] = new Course();
        student1.Course[1].Course_code = "C002";
        student1.Course[1].Course_Name = "Mathematics";
        student1.Course[1].Creadit = 2;
        student1.Course[2] = new Course();
        student1.Course[2].Course_code = "C003";
        student1.Course[2].Course_Name = "Science";
        student1.Course[2].Creadit = 2;

        Student student2 = new Student();
        student2.Name = "Pluem2";
        student2.Student_code = "S002";
        student2.Course = new Course[3];
        student2.Course[0] = new Course();
        student2.Course[0].Course_code = "C001";
        student2.Course[0].Course_Name = "English";
        student2.Course[0].Creadit = 1;
        student2.Course[1] = new Course();
        student2.Course[1].Course_code = "C002";
        student2.Course[1].Course_Name = "Mathematics";
        student2.Course[1].Creadit = 2;
        student2.Course[2] = new Course();
        student2.Course[2].Course_code = "C003";
        student2.Course[2].Course_Name = "Science";
        student2.Course[2].Creadit = 2;

        
        Course course1 = new Course();
        course1.Course_code = "C001";
        course1.Course_Name = "English";
        course1.Creadit = 1;

        Course course2 = new Course();
        course2.Course_code = "C002";
        course2.Course_Name = "Mathematics";
        course2.Creadit = 2;

        Course course3 = new Course();
        course3.Course_code = "C003";
        course3.Course_Name = "Science";
        course3.Creadit = 2;

        
        student1.ShowDetails();
        student2.ShowDetails();

        course1.ShowDetails();
        course2.ShowDetails();
        course3.ShowDetails();
    }
}







