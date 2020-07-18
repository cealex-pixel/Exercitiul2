
import java.util.Scanner;

public class fiveday {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5: ");
        int weekDay = scanner.nextInt();

        switch(weekDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("it is a weekend");




        }
    }
}
