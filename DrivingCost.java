import java.util.Scanner;

public class DrivingCost {
    public static void main (String[] args){
     Scanner input = new Scanner (System.in);

//Obtain Driving Distance
System.out.println("Enter the driving distance: ");
double distance = input.nextDouble();

//Obtain Miles per Gallon
System.out.println("Enter miles per gallon: ");
double mpg = input.nextDouble();

//Obtain Price per Gallon
System.out.println("Enter price per gallon: ");
double price = input.nextDouble();

//Calculate cost of driving
double gallons = (distance/mpg);
double cost = (price * gallons);

//Display results
System.out.printf("The cost of driving is $%.2f\n", cost);
    }
}