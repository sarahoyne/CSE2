import java.util.Scanner; //import scanner
public class CheckDigit { //declare class
    public static void main (String[] args) {  //declare methos
        Scanner myScanner = new Scanner(System.in); //setup scanner
        System.out.println("Enter ISBN :  "); //prompt user to enter ISBN
        String ISBN = "";
        String ISBNnumbers = "";
        int ISBN3 = 0; //declaring integers
        int Z = 10;
        int sum = 0;
        int lastdigit =0;
        boolean check = true; 
        while (check) {
            ISBN = myScanner.next();
            if(ISBN.length()!=10){
                System.out.println("You must enter a 10 character ISBN. Please try again.");
                //myScanner.next();

            }
            else{
        
        for(int Q =0; Q<ISBN.length() - 1; Q++ ) {   
  //              System.out.println(Z);
//                System.out.println(Character.getNumericValue(ISBN.charAt(Q)));
          
        sum += Z*Character.getNumericValue(ISBN.charAt(Q)); //multiplying and adding the place of the number and the number
          Z--;
         //System.out.println("sum= "+sum);
            
        }
        //System.out.println(divided);
        //System.out.println(sum);
        int divided = sum%11;
        //System.out.println(divided);
        if(ISBN.charAt(9) =='X' && divided==10){ //dealing with if last digit is x
            check=false;
            System.out.println("This is a valid ISBN");
        }
        else if(ISBN.charAt(9)=='X'&& divided != 10){
            check=false;
            System.out.println("Not a valid ISBN. The check digit should be "+ divided+ ".");
            
        }
        //dealing with if last digit is not x
        if(ISBN.charAt(9)!='X') {
            lastdigit=Character.getNumericValue(ISBN.charAt(9));
            if(divided==lastdigit){
                System.out.println("This is a valid ISBN");
            }
            else{ 
                check=false;
                if(divided==10){
                    System.out.println("Not a valid ISBN. The check digit should be X.");
                }
                else{
            System.out.println("Not a valid ISBN. The check digit should be "+ divided+ ".");
            }
                
            }
        }
            
        
        
        }
        }
        
}
}