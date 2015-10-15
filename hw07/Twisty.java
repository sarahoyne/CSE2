
import java.util.Scanner; // imports scanner

public class Twisty{ //declares class
    public static void main(String[] args) { //declares main method
        Scanner myScanner = new Scanner(System.in); //implements scanner
        boolean check = true; 
        int length = 0; //creates variables for length and width
        int width = 0;
        while (check){  //prompts user to enter a length of the box that is positive and if not asks them to try again
            System.out.println("Enter the length of the box: "); 
            if (myScanner.hasNextInt()){ 
                  length = myScanner.nextInt(); 
                 if(length > 0 && length < 80){ 
                    check = false; 
                 }
                 else{ 
                     System.out.println("Please enter a positive value: ");
                 }
            }
            else{ 
                System.out.println("Please enter a positive value: "); 
                myScanner.next(); 
            }
        }
        check = true;
        while (check){ //prompts user to enter a width of the box that is positive and if not asks them to try again
            System.out.println("Enter the width of the box: "); 
            if (myScanner.hasNextInt()){ 
                 width = myScanner.nextInt(); 
                 if(width > 0 && width <= length){ 
                    check = false; 
                 }
                 else{ 
                     System.out.println("Please enter a positive value: ");
                 }
            }
            else{ 
                System.out.println("Please enter a positive value: "); 
                myScanner.next(); 
            }
        }

        int c1 = 0;
        int c2 = 0;
        
        
            for (c2 = 0; c2 < width; c2++){  //increases c2 up until width of the box
             
             int i = 0;
             int counter = 0;
                while (counter < length){
                    for (c1 = 0; c1 < width; c1++){ 
                        if (i == 0){ //check for order to print x's 
                            if (c1 == c2 && counter <= length){ 
                                System.out.print("#");
                                    counter++;
                            }
                    else if (c2 == width - 1 - c1 && counter <= length){ //use this to print in the other direction
                        System.out.print("/");
                        counter++;
                    }
                    else { 
                    System.out.print(" "); // space between characters
                    counter++;
                    }
                }
                    if (i == 1){ //switches order of printing
                    if (c1 == c2 && counter <= length){ //repeat previous step
                        System.out.print("\\");
                        counter++;
                    }
                    else if (c2 == width - 1 - c1 && counter <= length){
                        System.out.print("#");
                        counter++;
                    }
                    else { 
                    System.out.print(" ");
                    counter++;
                    }
                    }
                    
                    }
                 if (i == 0){ //keeps loop going
                        i = 1;
                    }
                    else {
                        i = 0;
                }   
                } System.out.println(); //breaks loop
                
                
            }
            
    }
}
