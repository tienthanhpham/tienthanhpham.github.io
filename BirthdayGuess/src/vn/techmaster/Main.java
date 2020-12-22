package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String set1 =
                " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int day = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        if (answer == 1)
            day += 1;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 2;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 4;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 8;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 16;

        System.out.println("\nYour birthday is " + day + "!");
    }
}

import java.util.ArrayList;

// Represents all the different types of BillPayers
// and the methods used by them
public interface BillPayer {
	
	public void calculateBill(double amountDue);

}

// Represents the methods that will change based off
// of different BillPayers
interface Command {
	
	public void executeCalculateBill(double amountDue);
	
}

// Different BillPayers
class WomanOver60 implements BillPayer{

	public void calculateBill(double amountDue) {
		
		System.out.println("Bill Amount for Woman Over 60: $" + (amountDue - (amountDue * .10)));
		
	}
	
}

class ManOver60 implements BillPayer{

	public void calculateBill(double amountDue) {
		
		System.out.println("Bill Amount for Man Over 60: $" + (amountDue - (amountDue * .05)));
		
	}
	
}

class ManUnder60 implements BillPayer{

	public void calculateBill(double amountDue) {
		
		System.out.println("Bill Amount for Man Under 60: $" + amountDue);
		
	}
	
}

// Command: Calls the right executeCalculateBill method
// based on the BillPayer type

class Waiter implements Command{
	
	BillPayer thePayer;
	
	Waiter(BillPayer thePayer){
		
		this.thePayer = thePayer;
		
	}

	public void executeCalculateBill(double amountDue) {
		
		thePayer.calculateBill(amountDue);
		
	}

}

// This is the invoker. When returnFinalBill() is called
// it executes the right executeCalculateBill() based
// on the object type stored in theCommand

// This invoker can except numerous Command types and
// then execute different methods based on the Command
// type, but here it is limited to just one

class CashRegister{
	
	Command theCommand;
	
	CashRegister(Command newCommand){
		
		theCommand = newCommand;
		
	}
	
	public void returnFinalBill(double amountDue){
		
		theCommand.executeCalculateBill(amountDue);
		
	}
	
}

// Returns the right BillPayer object based on the method called
// If I want to add another BillPayer I just update this and
// create a new BillPayer class (That's It)

class CustomerTypePicker{
	
	public static BillPayer getWomanOver60(){
		
		return new WomanOver60();
		
	}
	
	public static BillPayer getManOver60(){
		
		return new ManOver60();
		
	}
	
	public static BillPayer getManUnder60(){
		
		return new ManUnder60();
		
	}
	
}

// Group BillPayers into an ArrayList
// Now you can use these BillPayers as simple commands

class CustomerGroup{

	ArrayList<BillPayer> customers;
	
	CustomerGroup(){
		
		customers = new ArrayList<BillPayer>();
		
	}
	
	public void add(BillPayer newPayer){
		
		customers.add(newPayer);
		
	}
	
	public BillPayer get(int customerIndex){
		
		return customers.get(customerIndex);
		
	}

}

class UseCashRegister{
	
	public static void main(String[] args){
		
		// Get the customer to use for bill calculation
		
		BillPayer sallyMay = CustomerTypePicker.getWomanOver60();
		
		// The Waiter sets the customer type so that the right 
		// executeCalculateBill method is called
		
		Waiter theWaiter = new Waiter(sallyMay);
		
		// The invoker makes sure the right method is called and
		// stores the Waiter so BillPayers assigned to Waiter
		// are available
		
		CashRegister calculateBill = new CashRegister(theWaiter);
		
		// When returnFinalBill() is called that signals that the
		// Waiter stored in CashRegister should execute method
		// executeCalculateBill
		
		calculateBill.returnFinalBill(12.00);
		
		// Calculate for Man over 60
		
		BillPayer paulThumb = CustomerTypePicker.getManOver60();
		theWaiter = new Waiter(paulThumb);
		calculateBill = new CashRegister(theWaiter);
		calculateBill.returnFinalBill(12.00);
		
		// Call commands from the BillPayer ArrayList
		
		CustomerGroup custGroup = new CustomerGroup();
		custGroup.add(CustomerTypePicker.getWomanOver60());
		custGroup.get(0).calculateBill(12.00);
		
		
	}
	
}

// The Wrong Way
// 1. To add a new Customer type I have to change the Customer
// logic for returnFinalBill
// 2. Adding a new discount requires editing the class
// 3. If I want to implement a new calculation device I can't

class Customer{
	
	private int age;
	private boolean man;
	private double bill;
	
	public int getAge() { return age;}
	public void setAge(int age) { this.age = age;}
	public boolean isMan() {return man;}
	public void setMan(boolean man) {this.man = man;}
	
	public Customer(int age, boolean man, double bill) {
		this.age = age;
		this.man = man;
		this.bill = bill;
	}
	
	public void returnFinalBill(){
		
		double percentageOff = 0.0;
		
		if(age > 60){ percentageOff += .05; }
		if(!man){ percentageOff += .05; }
		
		System.out.println("Bill Amount: $" + (bill - (bill * percentageOff)));
		
	}
	
	public static void main(String[] args){
		
		Customer billSmith = new Customer(62, true, 12);
		
		billSmith.returnFinalBill();
		
	}
	
}

function getPayAmount() {
	let result;
	if (isDead)
		result = deadAmount();
	else {
		if (isSeparated)
			result = separatedAmount();
		else {
			if (isRetired)
				result = retiredAmount();
			else
				result = normalPayAmount();
		}
	}
}

    
    
    
    

