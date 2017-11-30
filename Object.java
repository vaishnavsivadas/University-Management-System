import java.util.*;
import java.io.*;
public class Object{
    Student s=new Student();
    public void Input(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name=s1.nextLine();
        System.out.println("Enter Roll Number: ");
        String roll=s1.next();
        System.out.println("Enter Branch: ");
        String branch=s1.next();
        Student s2 = new Student(name,roll,branch);
    
        
    }
    public void inputFaculty(){
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name=s2.nextLine();
        System.out.println("Choose from the courses below: ");
        for(Courses c2: Courses.coursesCount){
            System.out.println("\n"+c2.getCourseCode() + "\t" + c2.getCourseName());
        }
        System.out.println("");
        System.out.println("Enter Course name: ");
        String subject=s2.nextLine();
        System.out.println("Enter the course code: ");
        String courseCode=s2.next();
        for(Courses c2: Courses.coursesCount){
            if (subject.equals(c2.getCourseName())&&courseCode.equals(c2.getCourseCode())){
                System.out.println("Matching course found.");
                Faculty f2=new Faculty(name,subject,courseCode);
                continue;
            }
            
                
            }
        }
        
    
    public int getValue(){
        Scanner s2 = new Scanner(System.in);
        return s2.nextInt();
        
    }
    public void inputCourse(){
        Scanner s3=new Scanner(System.in);
        System.out.println("Enter the course Name: ");
        String courseName=s3.nextLine();
        System.out.println("Enter the course code: ");
        String courseCode=s3.next();
        System.out.println("Enter the credit for the course: ");
        int credit=s3.nextInt();
        Courses c1=new Courses(courseName,courseCode,credit);
    }
    public void inputMarks(){
        try{
            Scanner s3=new Scanner(System.in);
            System.out.println("Enter the roll number (U4XXXXXXXXXX): ");
            String r0=s3.next();
            System.out.println("Enter the subject code: ");
            String c0=s3.next();
            Courses c1=Courses.checkCode(c0);
            if(c1!=null){
                System.out.println(c1.getCourseName());
                System.out.println();
                String name=c1.getCourseName();
                float credit=(float)c1.getCourseCredit();
                System.out.println("Enter the Internal marks ( /20)");
                int internal=s3.nextInt();
                System.out.println("Enter the External marks ( /100)");
                int external=s3.nextInt();
                Marks m=new Marks(r0,name, credit, internal, external);
            }
        }catch(Exception e){}
    }
}
