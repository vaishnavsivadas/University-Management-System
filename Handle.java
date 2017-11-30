import java.io.*;
import java.util.ArrayList;
public class Handle implements Serializable{
    private static final long serialVersionUID = 1L;
    
    
    public void write(){
       if(this instanceof Student){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos=new FileOutputStream("Files/Students.ser");
            oos=new ObjectOutputStream(fos);
           
            oos.writeObject(Student.countStudents);
            oos.flush();
            oos.close();
        }
        catch(FileNotFoundException fnfe){System.out.println("File not found");}
        catch(IOException ioe){};
    }
    if(this instanceof Faculty){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos=new FileOutputStream("Files/Faculty.ser");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(Faculty.countFaculties);
            oos.flush();
            oos.close();
        }
        catch(FileNotFoundException fnfe){System.out.println("File not found");}
        catch(IOException ioe){};
    }
    if(this instanceof Courses){
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try{
            fos=new FileOutputStream("Files/Courses.ser");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(Courses.coursesCount);
            oos.flush();
            oos.close();
        }
        catch(FileNotFoundException fnfe){System.out.println("File not found");}
        catch(IOException ioe){};
    }
    if(this instanceof Marks){
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try{
            fos=new FileOutputStream("Files/Marks.ser");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(Marks.marksW);
            oos.flush();
            oos.close();
        }catch(Exception e){}
    }
}
    public void read(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Student> studentCount = null;
        
 
        try {
            if(this instanceof Student){
            // reading binary data
            fis = new FileInputStream("Files/Students.ser");
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // reading object's value and casting ArrayList<Student>
            studentCount = (ArrayList<Student>)ois.readObject();
        } }
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        } 
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
        for(Student s1 : studentCount){
            System.out.println(s1.getName());
            System.out.println(s1.branch);
            System.out.println(s1.roll);
        }
        
            
    }
    public void readFaculty(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Faculty> facultyCount = null; 
        try {
            if(this instanceof Faculty){
                fis = new FileInputStream("Files/Faculty.ser");
                
                           // converting binary-data to java-object
                           ois = new ObjectInputStream(fis);
                
                           // reading object's value and casting ArrayList<Customer>
                           facultyCount = (ArrayList<Faculty>)ois.readObject();
                       } }
                       catch (FileNotFoundException fnfex) {
                           fnfex.printStackTrace();
                       }
                       catch (IOException ioex) {
                           ioex.printStackTrace();
                       } 
                       catch (ClassNotFoundException ccex) {
                           ccex.printStackTrace();
                       }
                       for(Faculty f : facultyCount){
                           System.out.println(f.name);
                           System.out.println(f.subject);
                           
                       }  
    }

    public void readCourse(){
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        ArrayList<Courses> countCourses=null;
        try{
            if(this instanceof Courses){
                fis=new FileInputStream("Files/Courses.ser");
                ois=new ObjectInputStream(fis);
                countCourses=(ArrayList<Courses>)ois.readObject();
            }
        }catch(FileNotFoundException fnfe){System.out.println("File not found");}
        catch(IOException ioe){}
        catch(ClassNotFoundException cnfe){}
        for(Courses c: countCourses){
            System.out.println(c.courseCode);
            System.out.println(c.courseName);
            System.out.println(c.credit);
        }
    }
        
        
        
           
           

            

            /*if(this instanceof Faculty){
                FileInputStream fis = null;
                ObjectInputStream ois = null;
                ArrayList<Faculty> countFaculty = null;
                //reading data
                fis = new FileInputStream("Files/Faculty.ser");
                //converting binary-data to java-object
                ois = new ObjectInputStream(fis);
                // reading object's value and casting ArrayList<Customer>
                countFaculty = (ArrayList<Faculty>)ois.readObject();
                for(Faculty s3: countFaculty){
                    System.out.println(s3.getName());
                }
                ois.close();
            } 
        }    
            catch (FileNotFoundException fnfe){}
            catch (IOException ioe){} 
            catch (ClassNotFoundException cnfe){}
        

    }*/
}
