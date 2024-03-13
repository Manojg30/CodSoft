import java.util.Scanner;

public class StudentGradeCalculator
{
public static void main(String[]args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the Student Grade Calculator!");
System.out.println("please enter the Student's name:");
String name = scanner.nextLine();
System.out.println("enter the student's Score for the first exam:");
double exam1 = scanner.nextDouble();
System.out.println("enter the student's Score for the second exam:");
double exam2 = scanner.nextDouble();
System.out.println("enter the student's Score for the third exam:");
double exam3 = scanner.nextDouble();
System.out.println("enter the student's Score for the final exam:");
double finalexam = scanner.nextDouble();
double totalScore = exam1 + exam2 + exam3 + finalexam;
double average = totalScore / 4;

char grade;
if(average>=90)
{
grade ='A';
}
else if(average>=80)
{
grade ='B';
}
else if(average>=70)
{
grade ='C';
}
else if(average>=60)
{
grade ='D';
}
else if(average>=50)
{
grade ='E';
}
else
{
grade ='F';
}
System.out.println("\nStudent Name:"+name);
System.out.println("Totalscore:"+ totalScore);
System.out.println("Average Score:"+average);
System.out.println("Grade:"+grade);
scanner.close();
}
}

