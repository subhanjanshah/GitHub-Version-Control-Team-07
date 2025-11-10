import java.util.Scanner;

class ATMMACHINE {

    private int pin = 3289;
    int balance = 500;

    public static void main(String[] args) {

        ATMMACHINE atm = new ATMMACHINE();
        atm.run();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your card.");

        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();
        scanner.nextLine();

        if (enteredPin != pin) {
            System.out.println("INCORRECT PIN!");
            return;
        }

        System.out.println("Pin correct.");
        System.out.println("Choose an action:");
        System.out.println("1. Cash Withdraw");
        System.out.println("2. Cash Deposit");
        System.out.println("3. Balance Check");
        System.out.println("4. Change Pin");
        System.out.print("Enter the Action: ");

        String action = scanner.nextLine();
        if (action.equalsIgnoreCase("1") || action.equalsIgnoreCase("Cash Withdraw")) 
        {
            // aruleja
        } 
        else if (action.equalsIgnoreCase("2") || action.equalsIgnoreCase("Cash Deposit")) 
        {
            // ruhan
        } 
        else if (action.equalsIgnoreCase("3") || action.equalsIgnoreCase("Balance Check")) 
        {
            // maheesha
        } 
        else if (action.equalsIgnoreCase("4") || action.equalsIgnoreCase("Change Pin")) 
        {
           // subhanjan
        } 
        else 
        {
            System.out.println("Invalid option. Choose 1-4.");
        }
    }

    // balance check - maheesha
    

    // withdraw money - aurelija
    

    // deposit money - ruhan
    

    // change pin - shah

}