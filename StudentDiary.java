import java.util.*;
public class StudentDiary{
    public static void main(String[] args){
        //ArrayList<Student> stud = null;
        //Student s0=new Student();
        //Student s1=new Student("Vishal","50","CSE");  
        //Faculty s2=new Faculty("Gautham","DSA","CSE202");
        //Faculty s3=new Faculty();
        //Courses c0=new Courses("DSA", "CSE220", 4);
        StudentDiary.init();
        Operations o=new Operations();
        o.navigate();
        
        
        
    }
    public static void init(){
        Student.countStudents=Student.getStudent();
        Faculty.countFaculties=Faculty.getFaculty();
        Courses.coursesCount=Courses.getCourses();
        Marks.marksW=Marks.getFinalMarks();
    }
}