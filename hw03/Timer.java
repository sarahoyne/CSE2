import java.util.Scanner;
//Calculates how much time until dinner 
//
//
public class Timer {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //declare scanner
        System.out.print("Enter the current time in the form 'HHMM'"); //prompt user to enter current time
        int currentTime = myScanner.nextInt(); //use scanner to retrieve time
        int currentHours = currentTime / 100; //convert time into just hours
        int currentMinutes = currentTime - (currentHours * 100); //convert current time into just minutes
        System.out.print("Enter the time that you will be eating dinner in the form 'HHMM"); //prompt user to enter dinner time
        int dinnerTime = myScanner.nextInt(); //use scanner to retrieve time
        int dinnerHours = (dinnerTime / 100); //convert time to just hours
        int dinnerMinutes = dinnerTime - (dinnerHours * 100); //convert time to just minutes
        if (dinnerMinutes==0) { dinnerMinutes=60;} 
        int hoursLeft = dinnerHours - currentHours; //calculate number of hours left
        int minutesLeft = dinnerMinutes - currentMinutes; //calculate number of minutes left
        if (minutesLeft<0){
            minutesLeft=dinnerMinutes+(60-currentMinutes);
        }
        if(minutesLeft>0){
            hoursLeft--;
        }
        System.out.println("You have "+ //print out how much time is left until dinner
            hoursLeft +" hours and "+
            minutesLeft +" minutes until dinner.");
    }
}
