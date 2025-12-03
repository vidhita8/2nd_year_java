
// Description: Create a Student class with:
// ● Instance variables: name, rollNumber, marks
// ● A static variable totalStudents to count total students
// ● Default constructor and parameterized constructor
// ● A method calculateGrade() that returns 'A' if marks ≥ 90, 'B' if ≥ 75, 'C' if ≥ 50, 'F'
// otherwise
// ● Use this keyword appropriately
// Expected Output:
// Total Students: 3
// John (101) Marks: 85 Grade: B
// Alice (102) Marks: 92 Grade: A
// Bob (103) Marks: 45 Grade: F

class Student{
    String name;
    int rollNumber;
    int marks;
    static int totalStudents=0;

    Student() {
        this.name="Unknown";
        this.rollNumber=0;
        this.marks=0;
    }

    Student(String name, int rollNumber, int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
        totalStudents++;
    }
    char calculateGrade(){
        if(marks>=90)
        return 'A';
        else if(marks>=75)
        return  'B';
        else if(marks>=50)
        return  'C';
        else 
        return 'F';
    }

    void display(){
        System.out.print(name+" ("+ rollNumber +") Marks: " + marks + " Grade: ");
        System.out.println(calculateGrade());
    }
}
public class oops1{
    public static void main(String[] args) {
        Student st1=new Student("Vidhita", 485, 100);
        Student st2=new Student("Sumi", 789, 34);
        Student st3=new Student();
        Student st4=new Student("Nidhi", 45, 89);

        System.out.println("Total Studnets: "+ Student.totalStudents);
        st1.display();
        st2.display();
        st3.display();
        st4.display();
    }
}