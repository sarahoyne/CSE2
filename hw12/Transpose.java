import java.util.Scanner; 

public class Transpose{ 
    public static void main(String[] args) { 
        Scanner myScanner = new Scanner(System.in);
            int width = 0;
            boolean isInt= false;
           boolean isRange= false;
           while (!isInt || !isRange){
            System.out.println("Enter width: ");
            
            if(myScanner.hasNextInt()){
                width = myScanner.nextInt();
              
                if(width>=0){
                  isRange=true;
                }
                else{
                    System.out.println("Not in range, try again:");
                }
                
               isInt=true;   
            }
        else{
            System.out.println("Not an Int: Try again");
            myScanner.next();
        }
           }
           int length= 0;
            boolean isInt2= false;
           boolean isRange2= false;
           while (!isInt2 || !isRange2){
            System.out.println("Enter length: ");
            
            if(myScanner.hasNextInt()){
                length = myScanner.nextInt();
              
                if(length>=0){
                  isRange2=true;
                }
                else{
                    System.out.println("Not in range, try again:");
                }
                
               isInt2=true;   
            }
        else{
            System.out.println("Not an Int: Try again");
            myScanner.next();
        } 
        
           }
           int[][] matrix = randomMatrix(width, length);
    printMatrix(matrix, length);
    int[][] matrix1 = transposeMatrix(matrix, width, length);
    printMatrix(matrix1, length);
           }
           
    public static int [][] randomMatrix(int width, int length){
        int matrix [][]= new int [width][length];
        int j =0;
        int i =0;
        for(i = 0; i <width; i++){
            for(j=0; j<length; j++){
            matrix[i][j]=(int)(Math.random()*10)+-10; } 
            }      
        return matrix;  
    } 
    
    public static void printMatrix(int[][]matrix, int length){
       
       
        int isRec = 0;
        int firstRow = matrix [0].length; 
        for(int x = 0; x<matrix.length-1; x++){
            if(matrix[x].length == matrix[x+1].length){
                
            }
            else{
                isRec=1;
            }
        }
            
        if(isRec==0){
        int z=0;
        int x=0;   
        for ( z = 0 ; z < matrix.length ; z++ ){
            for ( x = 0 ; x < matrix[z].length ; x++ ){
   	       System.out.print( matrix[z][x] + "   " );
   	    }
            System.out.println();
   	 }
        }
        else{
            System.out.println("Error: Not a rectangle");
        }
            
    }
    public static int[][] transposeMatrix(int[][]matrix, int length, int width){
        int l=0;
        int m=0;
        int[][] temp= new int [width][length];
        int x=0;
        
      // System.out.println("width"+ temp.length);
       //System.out.println("length" + temp[0].length);
       //System.out.println(length);
       //System.out.println(width);
        for (l = 0; l <length; l++) {
            for ( m = 0; m < width; m++) {
                temp[m][l] = matrix[l][m];
               // System.out.println("row:" + m + ", column: "+ l);
               // System.out.println(temp[m][l]);
                
             //   matrix[l][m] = matrix[m][l];
              //  matrix[m][l] = temp[][];
            }
    }
        return temp;
    
    }
     
     
     
     
           
    }       