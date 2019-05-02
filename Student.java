import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int balance;
    private int tuition;
    private String studentID;
    private String grade;
    private static int id = 1000;

    Scanner scanner = new Scanner(System.in);

    public Student() {
        this.firstName = studentFirstName();
        this.lastName = studentLastName();
        this.grade = studentGrade();
        id++;

        showInfo();
    }

    public String studentFirstName(){
        System.out.println("Enter first name:");
        String fName = scanner.nextLine();
        return  fName;
    }

    public String studentLastName(){
        System.out.println("Enter last name:");
        String lName = scanner.nextLine();
        return  lName;
    }

    public String studentGrade(){
        System.out.println("Enter grade:");
        String grade = scanner.nextLine();
        return  grade;
    }

    private void showInfo() {
        System.out.println("==============");
        System.out.println("First name: " + this.firstName+"\nLast name: " + this.lastName+"\n" +
                "Grade: " + this.grade+"\nID: "+id);
        System.out.println("==============");
    }


}
