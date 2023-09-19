
import java.util.Scanner;
public class numberguess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("_________________WELCOME TO NUMBER GUESSING GAME___________________");
        System.out.println("Enter your name ");
        String name = sc.nextLine() ;
        System.out.println("This a number guessing game in which you have to guess the number . ");
        System.out.println(" Hello " + name + " I thought a number between 0 - 100 " + "can you please guess it for me ");


        int attempts= 0 ;
        int num = (int)(Math.random()*100) ;
        while (true){

            System.out.println("Please enter your guess : ");
            int input = sc.nextInt();

            int lowerBound = 0 ;
            int upperBound = 100 ;

            attempts ++ ;

            if (input<lowerBound || input>upperBound){
                System.out.println("Please enter a number between" + lowerBound +"-" + upperBound );
                continue;
            } else if (num>input) {
                System.out.println("Your guess is too low please try again");
                continue;
            } else if (num<input ) {
                System.out.println("Your guess is too high please try again");
                continue;
            }
            else {
                System.out.println("Congratulations! You've guessed the number " + num + " correctly in " + attempts + " attempts.");
            }
            break;
        }



    }
}
