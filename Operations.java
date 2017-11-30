import java.util.*;
public class Operations{
    public void navigate(){
        System.out.println("=========== Welcome to the University Service portal. Choose from our services below  ===========");
        System.out.println("|                                                                                               |");
        System.out.println("|  1.Students Portal        4.Exit                                                              |");
        System.out.println("|  2.Faculties Portal                                                                           |");
        System.out.println("|  3.Admin's Portal                                                                             |");
        System.out.println("|                                                                                               |");
        System.out.println("=================================================================================================");
        System.out.println("");
        Scanner s=new Scanner(System.in);
        int nav=s.nextInt();
        switch(nav){
            case 1:
                Student t=new Student();
                t.resp();
                break;
            case 2:
                Faculty f=new Faculty();
                f.respond();
                break;
            case 3:
                Admin n=new Admin();
                n.navi();
                break;
            case 4:
                System.out.println("");
                System.out.println("==========Goodbye==========");
                break;
            default:
                System.out.println("Invalid Choice");
                
        }
    }
    
        
}