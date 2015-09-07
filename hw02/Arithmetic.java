//define a class
public class Arithmetic{
    
//add main method
public static void main(String[ ] args) {
    
//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
// ('$' is part of the variable name)
double sockCost=2.58;
//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost=2.29;
//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost=3.25;
double taxPercent=0.06;

//Calculate total cost of socks
double totalSockCost$;
totalSockCost$=nSocks*sockCost;
//Calculate total cost of glasses
double totalGlassesCost$;
totalGlassesCost$=nGlasses*glassCost;
//Calculate total cost of boxes of envelopes
double totalEnvelopeCost$;
totalEnvelopeCost$=nEnvelopes*envelopeCost;
System.out.println("Cost of Socks:  $"+totalSockCost$);
System.out.println("Cost of Glasses:  $"+totalGlassesCost$);
System.out.println("Cost of Envelopes:  $"+totalEnvelopeCost$);
//Calulate tax on socks
double socksTax$;
socksTax$=totalSockCost$*taxPercent;
//round to two decimal places
int socksTax2$=(int)(socksTax$*100);
double socksTax3$=socksTax2$;
socksTax3$/=100;
//Calculate tax on glasses
double glassesTax$;
glassesTax$=totalGlassesCost$*taxPercent;
//round to two decimal places
int glassesTax2$=(int)(glassesTax$*100);
double glassesTax3$=glassesTax2$;
glassesTax3$/=100;
//Calculate tax on Envelopes 
double envelopesTax$;
envelopesTax$=totalEnvelopeCost$*taxPercent;
//round to two decimal places
int envelopesTax2$=(int)(envelopesTax$*100);
double envelopesTax3$=envelopesTax2$;
envelopesTax3$/=100;
System.out.println("Tax on Socks:  $"+socksTax3$);
System.out.println("Tax on Glasses:  $"+glassesTax3$);
System.out.println("Tax on Envelopes:  $"+envelopesTax3$);
//Calculate total cost pretax
double totalPretaxCost$;
totalPretaxCost$=totalSockCost$+totalGlassesCost$+totalEnvelopeCost$;
System.out.println("Total Pretax Cost:  $"+totalPretaxCost$);
//Calculate total cost including tax
double totalCost;
totalCost=totalPretaxCost$+socksTax3$+glassesTax3$+envelopesTax3$;
//round to two decimal places
int totalCost2$=(int)(totalCost*100);
double totalCost3$=totalCost2$;
totalCost3$/=100;
System.out.print("Total Cost with Tax:  $"); 
System.out.printf("%.2f", totalCost3$);
System.out.println();
}
}