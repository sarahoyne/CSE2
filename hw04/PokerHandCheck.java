public class PokerHandCheck {
    //main method required for every Java program
    public static void main(String[] args) {
        
        System.out.println("Your random cards were: ");
        int aceCounter = 0;
        int twoCounter =0; int threeCounter=0; int fourCounter=0; int fiveCounter=0; int sixCounter=0; int sevenCounter=0; int eightCounter=0; int nineCounter=0; 
        int tenCounter=0; 
        int jackCounter=0; int queenCounter=0; int kingCounter=0;
        int spadecounter=0; int heartcounter=0; int diamondcounter=0; int clubcounter=0; 
        
        
        int card1 = (int)(Math.random()*13)+1;
        int suit1 = (int)(Math.random()*4)+1;
        switch(card1){
            case 1:
                switch(suit1){
                    case 1:
                        System.out.println("The Ace of spades");
                        aceCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The Ace of Diamonds");
                        aceCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The Ace of Clubs");
                        aceCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The Ace of Hearts");
                        aceCounter++;
                        heartcounter++; break;
                }//case 1 
break;
            case 2:
                switch(suit1){
                     case 1:
                        System.out.println("The two of spades");
                        twoCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The two of Diamonds");
                        twoCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The two of Clubs");
                        twoCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The two of Hearts");
                        twoCounter++;
                        heartcounter++; break;
 }break; 
            case 3:     
                switch(suit1){
                     case 1:
                        System.out.println("The three of spades");
                        threeCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The three of Diamonds");
                        threeCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The three of Clubs");
                        threeCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The three of Hearts"); 
                        threeCounter++;
                        heartcounter++; break;
 } break;     
            case 4:
                switch(suit1){
                     case 1:
                        System.out.println("The four of spades");
                        fourCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The four of Diamonds");
                        fourCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The four of Clubs");
                        fourCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The four of Hearts");
                        fourCounter++;
                        heartcounter++; break;
 } break;
            case 5:
                switch(suit1){
                     case 1:
                        System.out.println("The five of spades");
                        fiveCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The five of Diamonds");
                        fiveCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The five of Clubs");
                        fiveCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The five of Hearts");
                        fiveCounter++;
                        heartcounter++; break;
                }  
                   break;          
            case 6:
                switch(suit1){
                     case 1:
                        System.out.println("The six of spades");
                        sixCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The six of Diamonds");
                        sixCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The six of Clubs");
                        sixCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The six of Hearts");
                        sixCounter++;
                        heartcounter++; break;
                }     
           break;      case 7:
                switch(suit1){
                     case 1:
                        System.out.println("The seven of spades");
                        sevenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The seven of Diamonds");
                        sevenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The seven of Clubs");
                        sevenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The seven of Hearts");
                        sevenCounter++;
                        heartcounter++; break;
                }  
            break;     case 8:
                switch(suit1){
                     case 1:
                        System.out.println("The eight of spades");
                        eightCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The eight of Diamonds");
                        eightCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The eight of Clubs");
                        eightCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The eight of Hearts");
                        eightCounter++;
                        clubcounter++; break;
                } 
          break;       case 9:
                switch(suit1){
                     case 1:
                        System.out.println("The nine of spades");
                        nineCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The nine of Diamonds");
                        nineCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The nine of Clubs");
                        nineCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The nine of Hearts");
                        nineCounter++;
                        heartcounter++; break;
                } 
           break;      case 10:
                switch(suit1){
                     case 1:
                        System.out.println("The ten of spades");
                        tenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The ten of Diamonds");
                        tenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The ten of Clubs");
                        tenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The ten of Hearts");
                        tenCounter++;
                        heartcounter++; break;
                }   
           break;      case 11:
                switch(suit1){
                     case 1:
                        System.out.println("The jack of spades");
                        jackCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The jack of Diamonds");
                        jackCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The jack of Clubs");
                        jackCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The jack of Hearts");
                        jackCounter++;
                        heartcounter++; break;
                } 
          break;       case 12:
                switch(suit1){
                     case 1:
                        System.out.println("The queen of spades");
                        queenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The queen of Diamonds");
                        queenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The queen of Clubs");
                        queenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The queen of Hearts");
                        queenCounter++;
                        heartcounter++; break;
                } 
          break;       case 13:
                switch(suit1){
                     case 1:
                        System.out.println("The king of spades");
                        kingCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The king of Diamonds");
                        kingCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The king of Clubs");
                        kingCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The king of Hearts");
                        kingCounter++;
                        heartcounter++; break;
                }    
        }
        
       
     int card2 = (int)(Math.random()*13)+1;
        int suit2 = (int)(Math.random()*4)+1;
        switch(card2){
            case 1:
                switch(suit2){
                    case 1:
                        System.out.println("The Ace of spades");
                        aceCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The Ace of Diamonds");
                        aceCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The Ace of Clubs");
                        aceCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The Ace of Hearts");
                        aceCounter++;
                        heartcounter++; break;
                }//case 1 
           break;      case 2:
                switch(suit2){
                     case 1:
                        System.out.println("The two of spades");
                        twoCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The two of Diamonds");
                        twoCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The two of Clubs");
                        twoCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The two of Hearts");
                        twoCounter++;
                        heartcounter++; break;
                }
          break;       case 3:
                switch(suit2){
                     case 1:
                        System.out.println("The three of spades");
                        threeCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The three of Diamonds");
                        threeCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The three of Clubs");
                        threeCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The three of Hearts"); 
                        threeCounter++;
                        heartcounter++; break;
                }
         break;        case 4:
                switch(suit2){
                     case 1:
                        System.out.println("The four of spades");
                        fourCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The four of Diamonds");
                        fourCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The four of Clubs");
                        fourCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The four of Hearts");
                        fourCounter++;
                        heartcounter++; break;
                }
       break;          case 5:
                switch(suit2){
                     case 1:
                        System.out.println("The five of spades");
                        fiveCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The five of Diamonds");
                        fiveCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The five of Clubs");
                        fiveCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The five of Hearts");
                        fiveCounter++;
                        heartcounter++; break;
                }  
                        
         break;        case 6:
                switch(suit2){
                     case 1:
                        System.out.println("The six of spades");
                        sixCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The six of Diamonds");
                        sixCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The six of Clubs");
                        sixCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The six of Hearts");
                        sixCounter++;
                        heartcounter++; break;
                }     
           break;      case 7:
                switch(suit2){
                     case 1:
                        System.out.println("The seven of spades");
                        sevenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The seven of Diamonds");
                        sevenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The seven of Clubs");
                        sevenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The seven of Hearts");
                        sevenCounter++;
                        heartcounter++; break;
                }  
        break;         case 8:
                switch(suit2){
                     case 1:
                        System.out.println("The eight of spades");
                        eightCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The eight of Diamonds");
                        eightCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The eight of Clubs");
                        eightCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The eight of Hearts");
                        eightCounter++;
                        clubcounter++; break;
                } 
         break;        case 9:
                switch(suit2){
                     case 1:
                        System.out.println("The nine of spades");
                        nineCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The nine of Diamonds");
                        nineCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The nine of Clubs");
                        nineCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The nine of Hearts");
                        nineCounter++;
                        heartcounter++; break;
                } 
          break;       case 10:
                switch(suit1){
                     case 1:
                        System.out.println("The ten of spades");
                        tenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The ten of Diamonds");
                        tenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The ten of Clubs");
                        tenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The ten of Hearts");
                        tenCounter++;
                        heartcounter++; break;
                }   
          break;       case 11:
                switch(suit2){
                     case 1:
                        System.out.println("The jack of spades");
                        jackCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The jack of Diamonds");
                        jackCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The jack of Clubs");
                        jackCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The jack of Hearts");
                        jackCounter++;
                        heartcounter++; break;
                } 
          break;       case 12:
                switch(suit2){
                     case 1:
                        System.out.println("The queen of spades");
                        queenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The queen of Diamonds");
                        queenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The queen of Clubs");
                        queenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The queen of Hearts");
                        queenCounter++;
                        heartcounter++; break;
                } 
           break;      case 13:
                switch(suit2){
                     case 1:
                        System.out.println("The king of spades");
                        kingCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The king of Diamonds");
                        kingCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The king of Clubs");
                        kingCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The king of Hearts");
                        kingCounter++;
                        heartcounter++; break;
                }    
                
        }
                //third card
                
                int card3 = (int)(Math.random()*13)+1;
        int suit3 = (int)(Math.random()*4)+1;
        switch(card3){
            case 1:
                switch(suit3){
                    case 1:
                        System.out.println("The Ace of spades");
                        aceCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The Ace of Diamonds");
                        aceCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The Ace of Clubs");
                        aceCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The Ace of Hearts");
                        aceCounter++;
                        heartcounter++; break;
                }//case 1 
          break;       case 2:
                switch(suit3){
                     case 1:
                        System.out.println("The two of spades");
                        twoCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The two of Diamonds");
                        twoCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The two of Clubs");
                        twoCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The two of Hearts");
                        twoCounter++;
                        heartcounter++; break;
                }
            break;     case 3:
                switch(suit3){
                     case 1:
                        System.out.println("The three of spades");
                        threeCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The three of Diamonds");
                        threeCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The three of Clubs");
                        threeCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The three of Hearts"); 
                        threeCounter++;
                        heartcounter++; break;
                }
           break;      case 4:
                switch(suit3){
                     case 1:
                        System.out.println("The four of spades");
                        fourCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The four of Diamonds");
                        fourCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The four of Clubs");
                        fourCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The four of Hearts");
                        fourCounter++;
                        heartcounter++; break;
                }
         break;        case 5:
                switch(suit3){
                     case 1:
                        System.out.println("The five of spades");
                        fiveCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The five of Diamonds");
                        fiveCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The five of Clubs");
                        fiveCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The five of Hearts");
                        fiveCounter++;
                        heartcounter++; break;
                }  
                        
         break;        case 6:
                switch(suit3){
                     case 1:
                        System.out.println("The six of spades");
                        sixCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The six of Diamonds");
                        sixCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The six of Clubs");
                        sixCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The six of Hearts");
                        sixCounter++;
                        heartcounter++; break;
                }     
        break;         case 7:
                switch(suit3){
                     case 1:
                        System.out.println("The seven of spades");
                        sevenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The seven of Diamonds");
                        sevenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The seven of Clubs");
                        sevenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The seven of Hearts");
                        sevenCounter++;
                        heartcounter++; break;
                }  
         break;        case 8:
                switch(suit3){
                     case 1:
                        System.out.println("The eight of spades");
                        eightCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The eight of Diamonds");
                        eightCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The eight of Clubs");
                        eightCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The eight of Hearts");
                        eightCounter++;
                        clubcounter++; break;
                } 
            break;     case 9:
                switch(suit3){
                     case 1:
                        System.out.println("The nine of spades");
                        nineCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The nine of Diamonds");
                        nineCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The nine of Clubs");
                        nineCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The nine of Hearts");
                        nineCounter++;
                        heartcounter++; break;
                } 
            break;     case 10:
                switch(suit3){
                     case 1:
                        System.out.println("The ten of spades");
                        tenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The ten of Diamonds");
                        tenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The ten of Clubs");
                        tenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The ten of Hearts");
                        tenCounter++;
                        heartcounter++; break;
                }   
          break;       case 11:
                switch(suit3){
                     case 1:
                        System.out.println("The jack of spades");
                        jackCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The jack of Diamonds");
                        jackCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The jack of Clubs");
                        jackCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The jack of Hearts");
                        jackCounter++;
                        heartcounter++; break;
                } 
           break;      case 12:
                switch(suit3){
                     case 1:
                        System.out.println("The queen of spades");
                        queenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The queen of Diamonds");
                        queenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The queen of Clubs");
                        queenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The queen of Hearts");
                        queenCounter++;
                        heartcounter++; break;
                } 
          break;       case 13:
                switch(suit3){
                     case 1:
                        System.out.println("The king of spades");
                        kingCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The king of Diamonds");
                        kingCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The king of Clubs");
                        kingCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The king of Hearts");
                        kingCounter++;
                        heartcounter++; break;
                }    
        //card 4
        }
        int card4 = (int)(Math.random()*13)+1;
        int suit4 = (int)(Math.random()*4)+1;
        switch(card4){
            case 1:
                switch(suit4){
                    case 1:
                        System.out.println("The Ace of spades");
                        aceCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The Ace of Diamonds");
                        aceCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The Ace of Clubs");
                        aceCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The Ace of Hearts");
                        aceCounter++;
                        heartcounter++; break;
                }//case 1 
         break;        case 2:
                switch(suit4){
                     case 1:
                        System.out.println("The two of spades");
                        twoCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The two of Diamonds");
                        twoCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The two of Clubs");
                        twoCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The two of Hearts");
                        twoCounter++;
                        heartcounter++; break;
                }
          break;       case 3:
                switch(suit4){
                     case 1:
                        System.out.println("The three of spades");
                        threeCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The three of Diamonds");
                        threeCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The three of Clubs");
                        threeCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The three of Hearts"); 
                        threeCounter++;
                        heartcounter++; break;
                }
          break;       case 4:
                switch(suit4){
                     case 1:
                        System.out.println("The four of spades");
                        fourCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The four of Diamonds");
                        fourCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The four of Clubs");
                        fourCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The four of Hearts");
                        fourCounter++;
                        heartcounter++; break;
                }
       break;          case 5:
                switch(suit4){
                     case 1:
                        System.out.println("The five of spades");
                        fiveCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The five of Diamonds");
                        fiveCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The five of Clubs");
                        fiveCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The five of Hearts");
                        fiveCounter++;
                        heartcounter++; break;
                }  
                        
          break;       case 6:
                switch(suit4){
                     case 1:
                        System.out.println("The six of spades");
                        sixCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The six of Diamonds");
                        sixCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The six of Clubs");
                        sixCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The six of Hearts");
                        sixCounter++;
                        heartcounter++; break;
                }     
        break;         case 7:
                switch(suit4){
                     case 1:
                        System.out.println("The seven of spades");
                        sevenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The seven of Diamonds");
                        sevenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The seven of Clubs");
                        sevenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The seven of Hearts");
                        sevenCounter++;
                        heartcounter++; break;
                }  
         break;        case 8:
                switch(suit4){
                     case 1:
                        System.out.println("The eight of spades");
                        eightCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The eight of Diamonds");
                        eightCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The eight of Clubs");
                        eightCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The eight of Hearts");
                        eightCounter++;
                        clubcounter++; break;
                } 
           break;      case 9:
                switch(suit4){
                     case 1:
                        System.out.println("The nine of spades");
                        nineCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The nine of Diamonds");
                        nineCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The nine of Clubs");
                        nineCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The nine of Hearts");
                        nineCounter++;
                        heartcounter++; break;
                } 
          break;       case 10:
                switch(suit4){
                     case 1:
                        System.out.println("The ten of spades");
                        tenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The ten of Diamonds");
                        tenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The ten of Clubs");
                        tenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The ten of Hearts");
                        tenCounter++;
                        heartcounter++; break;
                }   
           break;      case 11:
                switch(suit4){
                     case 1:
                        System.out.println("The jack of spades");
                        jackCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The jack of Diamonds");
                        jackCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The jack of Clubs");
                        jackCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The jack of Hearts");
                        jackCounter++;
                        heartcounter++; break;
                } 
           break;      case 12:
                switch(suit4){
                     case 1:
                        System.out.println("The queen of spades");
                        queenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The queen of Diamonds");
                        queenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The queen of Clubs");
                        queenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The queen of Hearts");
                        queenCounter++;
                        heartcounter++; break;
                } 
          break;       case 13:
                switch(suit4){
                     case 1:
                        System.out.println("The king of spades");
                        kingCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The king of Diamonds");
                        kingCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The king of Clubs");
                        kingCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The king of Hearts");
                        kingCounter++;
                        heartcounter++; break;
                }
        }
        //card 5
        int card5 = (int)(Math.random()*13)+1;
        int suit5 = (int)(Math.random()*4)+1;
        switch(card5){
            case 1:
                switch(suit5){
                    case 1:
                        System.out.println("The Ace of spades");
                        aceCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The Ace of Diamonds");
                        aceCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The Ace of Clubs");
                        aceCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The Ace of Hearts");
                        aceCounter++;
                        heartcounter++; break;
                }//case 1 
         break;        case 2:
                switch(suit5){
                     case 1:
                        System.out.println("The two of spades");
                        twoCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The two of Diamonds");
                        twoCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The two of Clubs");
                        twoCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The two of Hearts");
                        twoCounter++;
                        heartcounter++; break;
                }
           break;      case 3:
                switch(suit5){
                     case 1:
                        System.out.println("The three of spades");
                        threeCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The three of Diamonds");
                        threeCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The three of Clubs");
                        threeCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The three of Hearts"); 
                        threeCounter++;
                        heartcounter++; break;
                }
           break;      case 4:
                switch(suit5){
                     case 1:
                        System.out.println("The four of spades");
                        fourCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The four of Diamonds");
                        fourCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The four of Clubs");
                        fourCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The four of Hearts");
                        fourCounter++;
                        heartcounter++; break;
                }
         break;        case 5:
                switch(suit5){
                     case 1:
                        System.out.println("The five of spades");
                        fiveCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The five of Diamonds");
                        fiveCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The five of Clubs");
                        fiveCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The five of Hearts");
                        fiveCounter++;
                        heartcounter++; break;
                }  
                        
           break;      case 6:
                switch(suit5){
                     case 1:
                        System.out.println("The six of spades");
                        sixCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The six of Diamonds");
                        sixCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The six of Clubs");
                        sixCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The six of Hearts");
                        sixCounter++;
                        heartcounter++; break;
                }     
         break;        case 7:
                switch(suit5){
                     case 1:
                        System.out.println("The seven of spades");
                        sevenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The seven of Diamonds");
                        sevenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The seven of Clubs");
                        sevenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The seven of Hearts");
                        sevenCounter++;
                        heartcounter++; break;
                }  
        break;         case 8:
                switch(suit5){
                     case 1:
                        System.out.println("The eight of spades");
                        eightCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The eight of Diamonds");
                        eightCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The eight of Clubs");
                        eightCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The eight of Hearts");
                        eightCounter++;
                        clubcounter++; break;
                } 
         break;        case 9:
                switch(suit5){
                     case 1:
                        System.out.println("The nine of spades");
                        nineCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The nine of Diamonds");
                        nineCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The nine of Clubs");
                        nineCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The nine of Hearts");
                        nineCounter++;
                        heartcounter++; break;
                } 
           break;      case 10:
                switch(suit5){
                     case 1:
                        System.out.println("The ten of spades");
                        tenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The ten of Diamonds");
                        tenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The ten of Clubs");
                        tenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The ten of Hearts");
                        tenCounter++;
                        heartcounter++; break;
                }   
          break;       case 11:
                switch(suit5){
                     case 1:
                        System.out.println("The jack of spades");
                        jackCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The jack of Diamonds");
                        jackCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The jack of Clubs");
                        jackCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The jack of Hearts");
                        jackCounter++;
                        heartcounter++; break;
                } 
           break;      case 12:
                switch(suit5){
                     case 1:
                        System.out.println("The queen of spades");
                        queenCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The queen of Diamonds");
                        queenCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The queen of Clubs");
                        queenCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The queen of Hearts");
                        queenCounter++;
                        heartcounter++; break;
                } 
            break;     case 13:
                switch(suit5){
                     case 1:
                        System.out.println("The king of spades");
                        kingCounter++;
                        spadecounter++; break;
                    case 2:
                        System.out.println("The king of Diamonds");
                        kingCounter++;
                        diamondcounter++; break;
                    case 3:
                        System.out.println("The king of Clubs");
                        kingCounter++;
                        clubcounter++; break;
                    case 4:
                        System.out.println("The king of Hearts");
                        kingCounter++;
                        heartcounter++; break;
                }    
            
        }    
        
        if(aceCounter==2||twoCounter==2||threeCounter==2||fourCounter==2 ||fiveCounter==2||sixCounter==2||sevenCounter==2||eightCounter==2||nineCounter==2||tenCounter==2||jackCounter==2||queenCounter==2||kingCounter==2){
            System.out.println("You have a pair");
            
        }
        
        else if(aceCounter==3||twoCounter==3||threeCounter==3||fourCounter==3 ||fiveCounter==3||sixCounter==3||sevenCounter==3||eightCounter==3||nineCounter==3||tenCounter==3||jackCounter==3||queenCounter==3||kingCounter==3){
            System.out.println("You have a 3 of a kind");
            
        }
        else{
            System.out.println("You have high card");
        }
    }
}


