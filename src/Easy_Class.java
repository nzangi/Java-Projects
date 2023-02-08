import java.util.Scanner;

public class Easy_Class {
    public static void main(String[] args){
        //create an instance of class
        Scanner scanner = new Scanner(System.in);
        int rollNumber;
        String name;
        float marks;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your marks : ");
        marks = scanner.nextFloat();
        System.out.println("Enter your roll number: ");
        rollNumber = scanner.nextInt();

        System.out.println("Your Name is: "+name);
        System.out.println("Your marks are: "+marks);
        System.out.println("Your roll number: " +rollNumber);
    }
}
