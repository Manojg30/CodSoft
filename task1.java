import java.util.Scanner;
import java.util.Random;
public class task1{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
Random random =new Random();
int maxRange = 100;
int randomNumber=random.nextInt(maxRange) + 1;
int guess;
int attempts=0;
System.out.println("welcome to the Number Guessing game!");
System.out.println("I hve chosen a number between 1 and "+ maxRange +".Try to guess it!");
do{
System.out.print("enter your guess:");
guess=scanner.nextInt();
attempts++;
if(guess < randomNumber)
{
System.out.println("too low! pls Try again.");
}
else if(guess > randomNumber){

System.out.println("too high! pls try again.");
}
else{
System.out.println("Congratulations! you guessed the number in" + attempts + "attempts!");
}
}while(guess != randomNumber);
scanner.close();
}
}
