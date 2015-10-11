import java.util.Scanner;
public class encrypted_x {
    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input integer between 0 and 100:  ");
        int input =myScanner.nextInt();
        boolean check = true;
        int i = 0;
        int j= 0;
        while(check) {
            input =myScanner.nextInt();
            if(input>100 || input<0) {
                System.out.println("You must enter an integer between 0 and 100. Please try again.");
            
            }
            else{
    for( i =0;i<input; i++) {
        for( j=0; j<input; j++) {
            System.out.println("*");
        }
        System.out.println();
    }
            }
        }
        
        }
        
    }

