// Jasmine Chi, AP CS Peterson
// Chapter 3 Project Part B
// This program uses initial investment, annual deposit, 
// interest rate, and number of years to calculate interest 
// on a savings account compounded annually


// Imports Scanner class
import java.util.Scanner;

public class Interest {

public static void main(String[] args) {
// Calls the method interest
interest(); 

}

// Takes input from user and calls the parameter calculate
public static void interest() {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your initial investment: ");
double amount = scanner.nextDouble();

System.out.println("Enter your annual deposit: ");
double annual = scanner.nextDouble();

System.out.println("Enter number of Years: ");
int years = scanner.nextInt();

System.out.println("Enter interest rate:");
double rate = scanner.nextDouble();

rate = rate * 10;

System.out.println(calculate(rate, annual, amount, years));
}

public static String calculate(double rate, double annual, double amount, int years) {
// Beginning of the list 

System.out.println("Year\tInterest Deposit Balance");
System.out.println("Start\t\t\t " + amount);

double rate2 = rate;
amount += annual + rate;

System.out.println("1\t" + rate2 + "\t " + annual + "\t " + amount);

rate = rate / 1000 * (amount);

// Loops through the list
for (int i = 2; i <= years; i++) {
amount += rate + annual;

// Truncates to two decimal places
rate = (int) (rate * 100.0) / 100.0;
amount = (int) (amount * 100.0) / 100.0;

// Prints out list 
System.out.println(i + "\t" + rate + "\t " + annual + "\t " + amount);

// Increases the rate

rate = rate2 / 1000 * amount;

}

return "";

}

}