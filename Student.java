import java.util.Scanner;
public class Student {
    int id;
    String name;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student ob = new Student();
        System.out.println("Enter id and name: ");
        //ob.id = 101;
        //ob.name = "Sree";
        ob.id = sc.nextInt();
        ob.name = sc.next();
        System.out.println("Student's id: "+ ob.id+"\n"+"Student's name: "+ob.name);
        sc.close();
    }
    
}
