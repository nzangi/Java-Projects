import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo,sum;
        System.out.println("Enter number one to multiply: ");
        numberOne = scanner.nextInt();
        System.out.println("Enter number two to multiply: ");
        numberTwo = scanner.nextInt();
        sum = numberTwo + numberOne;
        System.out.println("The sum of " + numberOne+" and "+ numberTwo+ " is: "+sum);
    }
}
