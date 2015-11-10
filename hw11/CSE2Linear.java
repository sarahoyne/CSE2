import java.util.Scanner; 

public class CSE2Linear{ 
    public static void main(String[] args) { 
        Scanner myScanner = new Scanner(System.in);
        int [] classGrades;
        classGrades = new int[15];
         int i=0;
         int j=0;
         classGrades[0]=-1;
         
         for(i = 0; i <classGrades.length; i++){
             j=i-1;
             int grade=0;
           
           boolean isInt= false;
           boolean isRange= false;
           boolean isGreater = false; 
           while (!isInt || !isRange || !isGreater){
            System.out.println("Enter grade number: ");
            
            if(myScanner.hasNextInt()){
                grade = myScanner.nextInt();
              
                if(grade<=100 && grade>=0){
                  isRange=true;
                }
                else{
                    System.out.println("Not in range, try again:");
                }
                if(i!=0){
                 if(grade>classGrades[i-1]){
                     isGreater = true; 
                 }   else{
                     System.out.println("Not greater than the last input");
                 }
                }
                else{
                    isGreater=true;
                }
               isInt=true;   
            }
        else{
            System.out.println("Not an INT: Try again");
            myScanner.next();
        }
        if(isInt && isRange && isGreater){
            classGrades[i]= grade; 
        }
           }
      
        
        
         }
         
         for(int x = 0; x<classGrades.length; x++){
             System.out.print(classGrades[x]+ " ");
         }
         
         find(classGrades);
         int[] shuffledArray = new int[15];
        shuffledArray = shuffle(classGrades);
                 for( int x = 0; x<classGrades.length; x++){
             System.out.print(shuffledArray[x] + " ");
         }
         find(shuffledArray);
         
    }
        
        
public static int[] shuffle(int[] Array){
        int temp;
        for(int i = 0; i <Array.length; i++){
            int random =(int)(Math.random()*15)+0;
            temp = Array[random];
            Array[random]=Array[i];
            Array[i] = temp;
        }
        return Array;
    }        
    
public static void find(int [] Array){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter value to search for: ");
   int searchValue=myScanner.nextInt();
   int c=0;
   int flag = 0;
   for (c = 0; c < 15; c++){
      if (Array[c] == searchValue){
          flag = 1;
         System.out.println(searchValue + " was found in the list with " + (c + 1) + " iterations.");
          break;
      }
  }
  if(flag == 0){
      System.out.println(searchValue + " is not present.");
  }
    
}       
        
    }