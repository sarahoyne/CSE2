import java.util.Scanner;
//Calculates volume and surface area of a block 
//
//
public class Block {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //declare scanner
        System.out.print("Enter the Length of the Block: ");
        double blockLength = myScanner.nextDouble(); 
        System.out.print("Enter the Width of the Block: ");
        double blockWidth = myScanner.nextDouble();
        System.out.print("Enter the Height of the Block: ");
        double blockHeight = myScanner.nextDouble();
        double blockVolume = blockHeight* blockWidth*blockLength;
        double surfaceArea = (blockHeight * blockWidth *2)+(blockHeight*blockLength*2)+(blockWidth*blockLength*2);
        System.out.println("The volume of the block with dimensions   "+   blockHeight  +  "  X  "  +  blockWidth +  "  X  "  +  blockLength  +"  is  "+ blockVolume );
        System.out.println(" The surface area of the block is    " + surfaceArea);
        
        
    }
}