import java.io.*;
import java.util.*;
public class Student extends Handle implements Serializable{
    private static final long serialVersionUID = 1L;
    
    public String rollNumber;
    public String name;
    public String branch;
    public String roll;
    //public int due;
    public int[] sgpa=new int[7];
    static ArrayList<Student> studentCount=new ArrayList<Student>(); //Static helps in accsessing the studentCount from anywhere
    static ArrayList<Student> countStudents=new ArrayList<Student>();
    ArrayList<Fine> f1;
    /*public void newStudent(){
        //this.rollNumber=rollNumber;
        System.out.println("Enter the name: ");
        this.name=s.next();
        System.out.println("Enter age: ");
        //this.age=s.nextInt();
        System.out.println("Enter branch: ");
        this.branch=s.next();
    }*/
    public String getName(){
        return name;
    }
    public String getRoll(){
        return roll;
    }
    public String getBranch(){
        return branch;
    }
    public void getStu(){
       
    }
    /*public Student(int i){
        
        studentCount.add(this);
        this.write();
    }*/
  
    public void view(){
        
        System.out.println("Roll Number is: "+roll);
        System.out.println("Name is: "+name);
        System.out.println("Branch is: "+branch);
    }
    public Student(){

    }
    public static ArrayList<Student> getStudent(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
 
        ArrayList<Student> studentCount = null;
 
        try {
            // reading binary data
            fis = new FileInputStream("Files/Students.ser");
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // reading object's value and casting ArrayList<Customer>
            studentCount = (ArrayList<Student>) ois.readObject();

        } 
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        } 
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
        return studentCount;
    }
    public Student(String name, String roll, String branch){
        this.name=name;
        this.roll=roll;
        this.branch=branch;
        countStudents.add(this);
        this.f1=new ArrayList<Fine>();
        this.write();
    }
    public static Student checkRoll(String s){
        for(Student st: Student.countStudents){
            if(st.getRoll().equals(s)){
                return st;
            }
            //else
                
                //System.out.println("Student with given roll number not found");
        }
        return null;
    }
    public void showFine(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the roll number of the student");
        String rol=s.next();
        Student s0=Student.checkRoll(rol);
        Fine f=new Fine();
        if(s0!=null){
            System.out.println("\nFine for "+s0.getName()+" is "+f.getFine());
        }
    }
    public void addFine(Fine p){
        this.f1.add(p);
    }
    public void showRecord(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the roll number of the student");
        String rol=s.next();
        Student s0=Student.checkRoll(rol);
        if(s0!=null){
            System.out.println("\n"+s0.getName() + "\t" + s0.getRoll() + "\t" + s0.getBranch());
        }
    }
    public void resp(){
        Student st=new Student();
        
        System.out.println("Welcome, You are now on the Students portal. Choose services from the following available:");
        System.out.println("1.Track Your Record   "+"2.Show Marks   "+"3. Show Department Dues   "+"4. Go to main menu");
        Object s=new Object();
        int c=s.getValue();
        switch(c){
            case 1:
                //st.assignRoll();
                Student st1=new Student();
                st1.showRecord();
                break;
            case 2:
                //Scanner s1=new Scanner(System.in);
                //System.out.println("Enter your roll number");
                //String roll0=s1.next();
                for(Marks m: Marks.marksW){
                    //System.out.println(m.rollN);
                    //if(roll0.equals(m.rollN)){
                        //System.out.println("Final marks of "+st.getName()+" are:" );
                        System.out.println("Internal mark: "+ m.getInternal()+"\t External Mark: "+m.getExternal()+"\t Total: "+ (m.getInternal()+m.getExternal()));                        }
                //}    
                break;
            case 3:
                Student st2=new Student();
                st2.showFine();
                break;
            case 4:
                Operations o1=new Operations();
                o1.navigate();
                break;
            default:
                System.out.println("Invalid Choice");
                break;   
        }
    }
}