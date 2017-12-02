public class Admin{
    public void navi(){
        System.out.println("1.Enter Student Details   "+"2.Show Student Details   "+"3.Enter Faculty Details   "+"4.Show Faculty Details   "+"5.Add Course   "+"6.Show Added Courses   "+"7.Go to main menu");
        Object s=new Object();
        int nav=s.getValue();
        switch(nav){
            case 1:
                Object t =new Object();
                t.Input();
                break;
            case 2:          
                for(Student t2 : Student.countStudents){	
                    System.out.println("\n"+t2.getName() + "\t" + t2.getRoll() + "\t" + t2.getBranch());
                    }
                    System.out.println();
                break;
            case 3:
                Object t1=new Object();
                t1.inputFaculty();
                break;
            case 4:
                System.out.println("Name<- - - - - - ->Course - - - - - - - ->Course Code");
                for(Faculty f2 : Faculty.countFaculties){
                    
                    System.out.println("\n"+f2.getName()+"                        \t"+f2.getSubject()+"             \t"+f2.getCourseCode());
                }
                System.out.println();
                break;
            case 5:
                Object t2=new Object();
                t2.inputCourse();
                break;
            case 6:
                for(Courses c2: Courses.coursesCount){
                    System.out.println("\n"+c2.getCourseCode() + "\t" + c2.getCourseName() +"\t" + c2.getCourseCredit());
                }
                break;
            case 7:
                Operations o=new Operations();
                o.navigate();
                break;
            default: 
                System.out.println("Invalid Choice");
                break;
        }
    }
}