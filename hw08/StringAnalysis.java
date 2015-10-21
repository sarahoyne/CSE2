import java.util.Scanner; //declares scanner
public class StringAnalysis { //main class
    public static void main (String[] args) { //main methof
    
    Scanner myScanner = new Scanner(System.in); //use scanner
    System.out.print("Please enter a string: "); //prompt user for string
    String User = myScanner.nextLine();
    System.out.print("Please enter 1 if you want to check all the letters. Please enter 2 if you want to check a specific amount of letters: "); //prompt user if they want to check all the letters of a specific amount
    int Check = myScanner.nextInt(); 
    if (Check == 1){ //what to do if you want to check all of the letters 
        boolean letters = allLetters(User);
        System.out.println( "It is " + letters + " that  all of the characters are letters.");
    }
   if (Check == 2){ //what to do if you want to only check a certain amount of lettesr
       System.out.print("How many letters would you like to check?  ");
       int numberLetters =myScanner.nextInt();
       boolean letters = allLetters(User, numberLetters);
       System.out.println( "It is " + letters + " that  the first " + numberLetters+ " characters are letters.");
   }
        
   }
   public static boolean allLetters(String User) {  //method for if you are checking all of the letters
     boolean check= true;
     
     //String User;
     int numLetters= 0;
     for(int i  = 0; i < User.length(); i++ ) {
         if (Character.isLetter(User.charAt(i))) { 
             numLetters++;}
     }
    if (numLetters == User.length()) {
        return check;
    }
   else{
       check = false;
       return check;}
    
   }
   public static  boolean allLetters(String User, int numberLetters) { //method if you are only chekcing the given amount of numbers
     boolean check= true;
     if(numberLetters>User.length()){
         numberLetters= User.length();
     }
     //String User;
     int numLetters= 0;
     for(int i  = 0; i < numberLetters; i++ ) {
         if (Character.isLetter(User.charAt(i))) { 
             numLetters++;}
     }
    if (numLetters == numberLetters) {
        return check;
    }
   else{
       check = false;
       return check;}
   }  
   
}