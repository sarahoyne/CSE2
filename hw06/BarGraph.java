import java.util.Scanner;
//imports scanner
public class BarGraph {
    public static void main (String[] args) {
        //main method
    Scanner myScanner2 = new Scanner(System.in);
    System.out.print("Enter Monday's expenses in the form xxx.xx");
    double mondayExpenses = myScanner2.nextDouble();
    System.out.print("Enter Tuesday's expenses in the form xxx.xx");
    double tuesdayExpenses = myScanner2.nextDouble();
    System.out.print("Enter Wednesday's expenses in the form xxx.xx");
    double wednesdayExpenses = myScanner2.nextDouble();
    System.out.print("Enter Thursday's expenses in the form xxx.xx");
    double thursdayExpenses = myScanner2.nextDouble();
    System.out.print("Enter Friday's expenses in the form xxx.xx");
    double fridayExpenses = myScanner2.nextDouble();
    System.out.print("Enter Saturday's expenses in the form xxx.xx");
    double saturdayExpenses = myScanner2.nextDouble();
    System.out.print("Enter Sunday's expenses in the form xxx.xx");
    double sundayExpenses = myScanner2.nextDouble();
    
int monday=0;
int tuesday=0;
int wednesday=0;
int thursday=0;
int friday=0;
int saturday=0;
int sunday=0;

if(( mondayExpenses*10- (int)(tuesdayExpenses*10))) >= 5) {                                                                                                                                                              mondayExpenses*10-(int)(mondayExpenses*10)>=5) {
    monday= (int)(mondayExpenses) + 1;
}
else monday=mondayExpense;

if( tuesdayExpenses*10-(int)(tuesdayExpenses*10) >=5) {
    tuesday=(int)(tuesdayExpenses) + 1;
}
else tuesday=tuesdayExpenses;

if( wednesdayExpenses*10-(int)(wednesdayExpenses*10) >=5 ) {
    wednesday=(int)(wednesdayExpenses) + 1;
}
else wednesday=wednesdayExpenses;

if( thursdayExpenses*10-(int)(thursdayExpenses*10)>=5) {
    thursday=(int)(thursdayExpenses)+1;
}
else thursday=thursdayExpenses;

if( fridayExpenses*10-(int)(fridayExpenses*10)>=5) {
    friday=(int)(fridayExpenses)+1;
}
else friday=fridayExpenses;

if( saturdayExpenses*10-(int)(saturdayExpenses*10)>=5) {
    saturday=(int)(saturdayExpenses)+1;
}
else saturday=saturdayExpenses;

if( sundayExpenses*10-(int)(sundayExpenses*10)>=5) {
    sunday=(int)(sundayExpenses)+1;
}
else sunday=sundayExpenses;

System.out.print("Mon: ");
for(int i = 0; i < monday; i++) {
    System.out.print("*");
}

System.out.println();
System.out.print("Tues: ");
for(int i= 0; i < tuesday; i++) {
    System.out.print("*");
}

System.out.println();
System.out.print("Wed: ");
for(int i = 0; i < wednesday; i++) {
    System.out.print("*");
}

System.out.println();
System.out.print("Thrus: ");
for(int i = 0; i < thursday; i++) {
    System.out.print("*");
}

System.out.println();
System.out.print("Fri: ");
for(int i = 0; i < wednesday; i++) {
    System.out.print("*");
}

System.out.println();
System.out.print("Sat: ");
for(int i = 0; i < saturday; i++) {
    System.out.print("*");
}

System.out.println();
System.out.print("Sun: ");
for(int i = 0; i < sunday; i++) {
    System.out.print("*")
}


    }

}