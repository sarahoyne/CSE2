import java.util.Scanner;
public class Stats {
    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter five doubles in ascending order. Please enter first double: ");
        double numberOne =myScanner.nextDouble();
        System.out.print("Enter next double: ");
        double numberTwo = 0;
        while (true) {
            numberTwo = myScanner.nextDouble();
            if (numberTwo >= numberOne) {
                break;
            }
            else {
                System.out.println("Number was not greater than previous number. Please try again:  "); //error message
                myScanner.next();
            }
        }
    
        System.out.print("Enter next double: ");
        double numberThree = 0;
        while (true) {
            numberThree = myScanner.nextDouble();
            if (numberThree >= numberTwo) {
                break;
            }
            else {
                System.out.println("Number was not greater than previous number. Please try again:  "); //error message
                myScanner.next();
            }
        }
        
    
        System.out.print("Enter next double: ");
        double numberFour = 0;
        while (true) {
            numberFour = myScanner.nextDouble();
            if (numberFour >= numberThree) {
                break;
            }
            else {
                System.out.println("Number was not greater than previous number. Please try again:  "); //error message
                myScanner.next();
            }
        }
        
        
        
        System.out.print("Enter next double: ");
        double numberFive =0;
        while (true) {
            numberFive = myScanner.nextDouble();
            if (numberFive >= numberFour) {
                break;
            }
            else {
                System.out.println("Number was not greater than previous number. Please try again:  "); //error message
                myScanner.next();
            }
        }
    }
public static double mean (double numberOne,double numberTwo, double numberThree, double  numberFour, double numberFive) {
double average = (numberOne+numberTwo+numberThree+numberFour+numberFive)/5;
return average;
        }
public static double median (double numberOne,double numberTwo, double numberThree, double numberFour, double numberFive) {
double medians = numberThree;
return medians;
        }
public static double printInfo(double average, double medians){
System.out.print("The mean is  "+ average);
System.out.println("The median is  " + medians);
     }  }
    

