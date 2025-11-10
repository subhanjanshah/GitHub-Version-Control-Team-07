import java.util.Scanner;

class ATMMACHINE {

    private int pin = 3289;
    int balance = 500;

    public static void main(String[] args) 
    {
        ATMMACHINE atm = new ATMMACHINE();
        atm.run();
    }

    public void run() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your card.");

        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();
        scanner.nextLine();

        if (enteredPin != pin) 
        {
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
            deposit();
        } 
        else if (action.equalsIgnoreCase("3") || action.equalsIgnoreCase("Balance Check")) 
        {
            showAccountHolder();
        } 
        else if (action.equalsIgnoreCase("4") || action.equalsIgnoreCase("Change Pin")) 
        {
            changePin();
        } 
        else 
        {
            System.out.println("Invalid option. Choose 1-4.");
        }
    }

    // balance check - maheesha
    public void showAccountHolder() 
    {
        System.out.println("Your current balance is: " + balance + " euros");
    }

    // inner class (not used here but kept same)
    class accountHolder 
    {
        private String name;
        private String accountNumber;
        int currentBalance;

        public accountHolder(String name, String accountNumber) 
        {
            this.name = name;
            this.accountNumber = accountNumber;
            currentBalance = 0;
        }
    }

    

    // withdraw money - aurelija
    

    // deposit money - ruhan
    public void deposit() 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("You can only deposit up to 2000 at a time.");

        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();

        if (amount <= 0) 
        {
            System.out.println("Invalid amount.");
        } 
        else if (amount > 2000) 
        {
            System.out.println("Deposit limit exceeded.");
        } 
        else 
        {
            balance += amount; 
            System.out.println("Deposit successful!");
            System.out.println("Deposited: " + amount + " euros");
            System.out.println("New balance: " + balance + " euros");
        }
    }

    // Change pin part - Subhanjan
    public void changePin() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new PIN: ");
        int newPin = sc.nextInt();

        if (newPin == pin) 
        {
            System.out.println("New PIN must be different from old PIN.");
        } 
        else 
        {
            pin = newPin;
            System.out.println("PIN changed successfully!");
        }
    }
}