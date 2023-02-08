import java.util.Scanner;

public class Addition {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lengthGrade;
        System.out.print("Enter how many grades which you need to add: ");
        lengthGrade = scanner.nextInt();
        int number;
        double sum = 0;
        for (int i = 0; i < lengthGrade;i++){
            System.out.print("Enter the grade number: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("The sum of the " +lengthGrade+ "is : "+sum);
        System.out.println("The avarage of " + sum+"/"+lengthGrade+ " is "+ sum/lengthGrade);

    }
}
