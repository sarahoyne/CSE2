import java.util.Scanner;
//Calculates how much of a tip each person should pay when going out to a restaurant 
//
//
public class Check{
    //main method required for every Java program
    public static void main (String[] args) {
Scanner myScanner=new Scanner ( System.in );
System.out.print("Enter the original cost of the check in the form xx.xx: ");
double checkCost= myScanner.nextDouble();
System.out.print("Enter tne percentage tip that you wish to pay as a whole number (in the form xx):");
double tipPercent = myScanner.nextDouble();
tipPercent /=100; //We want to convert this percentage to a decimal value
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople = myScanner.nextInt () ;
double totalCost;
double costPerPerson;
int dollars, //whole dollar amount of cost
    dimes,
    pennies; //for storing digits right of the decimal point
totalCost=checkCost*(1+tipPercent);
costPerPerson = totalCost / numPeople;
dollars=(int)costPerPerson;
dimes=(int) (costPerPerson * 10) % 10;
pennies=(int) (costPerPerson * 100) % 10;
System.out.println("Each person in the group owes: $"+dollars+'.'+dimes+pennies);
    }//end of main method
} //end of class