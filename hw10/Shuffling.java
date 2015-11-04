public class Shuffling {
    public static void shuffle(String[] Array){
        String temp = "";
        for(int i = 0; i <60; i++){
            int k =(int)(Math.random()*51)+1;
            temp = Array[k];
            Array[k]=Array[0];
            Array[0] = temp;
        }
    }
    public static void printArray(String[] Array){
        int i =0;
        do{
            System.out.print(Array[i] + " "); 
            i++;
        } while (i<Array.length);
    }
    public static String[] randomizeHand(String[] Array){
        int i=0;
        int k=0;
        String [] B = new String[5];
        for (k=0;k<5; k++){
                     while (k<5){
                         i= (int)(Math.random()*51)+1; //makes random number between 1 and 52
                        B[k]= Array[i]; //uses random value to determine which goes into array A
                        k++;
        //    }
            }
        }
        return B;
    }
  
    public static void main(String[] args) {
     
     String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            //System.out.print(cards[i]+" ");
        }
        printArray(cards);
        System.out.println("");
        System.out.println("Shuffle:");
        shuffle(cards);
        printArray(cards);
        System.out.println("");
        System.out.println("Hand: ");
        hand = randomizeHand(cards);
        printArray(hand);
  }
}
    
    
    
    
    
    
    
