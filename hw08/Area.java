import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner myScanner =new Scanner(System.in);
        System.out.println("Please enter either circle, triangle, rectangle: ");
        double triangleBase = 0;
        double triangleHeight = 0;
        double height = 0;
        double length = 0;
        double radius = 0;
        boolean check1= true;
        while (check1){
            if(myScanner.hasNext()){
                String shape= myScanner.next();
            if(shape.equals("triangle")){
                System.out.println("Enter base of triangle: ");
                double number1 =check(triangleBase);
                System.out.println("Enter the height of triangle: ");
                double number2=check(triangleHeight);
                double triangleArea= Triangle(number1,number2);
                System.out.println("The area is" + triangleArea);
                check1=false;
            } 
            else if(shape.equals("rectangle")){
            System.out.println("Enter height: ");
            double sideA = check(height);
            System.out.println("Enter width: ");
            double sideB = check(length);
            double rectangleArea = Rectangle(sideA, sideB);
            System.out.println("The area of the rectangle is: " + rectangleArea);
            check1 = false;

            }
            else if(shape.equals("circle")){
            System.out.println("Enter radius of the circle: ");
            double radiusA = check(radius);
            double circleArea = Circle(radiusA);
            System.out.println("The area of the circle is: " + circleArea);
            check1 = false;
            
        }
        else{
            System.out.println("You have entered an invalid shape. Enter a valid shape:");
            myScanner.next();
        }
    } 
        }
    }
    
    public static double Triangle(double AA, double BB){
       double area =(AA*BB)/2;
       return area;
    }
    public static double Rectangle(double AA, double BB){
        double area =(AA*BB);
        return area;
    }
    public static double Circle(double AA){
        double area= ((AA*AA)*3.14);
        return area;
    }
    public static double check(double CC){
        Scanner myScanner=new Scanner(System.in);
        boolean check = true;
        while (check){
            if(myScanner.hasNextDouble()) {
                CC=myScanner.nextDouble();
                if(CC>0){
                    check=false;
                }
                else{
                    System.out.println("You did not enter a valid value. Please try again:");
                    myScanner.next();
                }
            }
            
        }
        return CC;
                
        }
    }
