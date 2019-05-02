import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose the option:\nA => Add new student\nQ => Quit");
        String option = scan.nextLine();

        while(!option.equalsIgnoreCase("q")){
            if(option.equalsIgnoreCase("a")){
                new Student();
            }

            System.out.println("Choose the option:\nA => Add new student\nQ => Quit");
            option = scan.nextLine();


        }
    }
}
