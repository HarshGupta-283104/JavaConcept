
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        // System.out.println(
        //     "Radhe Radhe"
        // );
        // System.out.println(""+5+6); // Because You are giving string first. So the computer is converting the number in string and concatinating number with string as string.
        // int x = 5;
        // x--; // We call it Decrement function
        // System.out.println(x); 
        Scanner sc = new Scanner(System.in);
        // int UserInput = sc.nextInt();
        // System.out.println("You have entered " + UserInput);
        // Printing the day by taking input from 1 to 7 and print day according to it.
        // Let's Do it
        // int DayInput = sc.nextInt();
        // switch (DayInput) {
        //     case 1:
        //         System.out.println("It's Monday.");
        //         break;
        //     case 2:
        //         System.out.println("It's Tuesday.");
        //         break;
        //     case 3:
        //         System.out.println("It's Wednesday.");
        //         break;
        //     case 4:
        //         System.out.println("It's Thrusday.");
        //         break;
        //     case 5:
        //         System.out.println("It's Friday.");
        //         break;
        //     case 6:
        //         System.out.println("It's Saturday.");
        //         break;
        //     case 7:
        //         System.out.println("It's Sunday.");
        //         break;
        //     default:
        //         System.out.println("Invalid Enter right number in between 1 to 7.");

            // Do while loops
        // }
        // int Number = 5;
        // do { 
        //     System.out.println(Number++);
        // } while (Number <= 8);
        // Count and all the number given in input.
        int UserIntNumber = sc.nextInt();
        int Copy1 = UserIntNumber;
        int Copy2 = UserIntNumber;
        int Sum = 0;
        int IntCount = 0;
        while (Copy1 > 0) {
            Sum += Copy1 % 10;
            Copy1 /=  10; // Reduce Copy1 to avoid infinite loop
        }

        // Loop to count the number of digits
        while (Copy2 > 0) {
            Copy2 = Copy2 / 10;
            IntCount++;
        }

        System.out.println("The sum is " + Sum);
        System.out.println("The number of digits is " + IntCount);
        sc.close();
    }
}
