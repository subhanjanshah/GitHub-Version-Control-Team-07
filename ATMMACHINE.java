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
            Withdraw();
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
    public void Withdraw() 
    {
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much money would you like to withdraw:");
        sum = scanner.nextInt();

        if (sum > balance) 
        {
            System.out.println("Error: entered amount exceeds your balance");
        } 
        else if (sum > 400) 
        {
            System.out.println("Error: entered amount exceeds the maximum limit (400€)");
        } 
        else if (sum < 5) 
        {
            System.out.println("Error: entered amount is too small");
        } 
        else if (sum % 5 != 0) 
        {
            System.out.println("Error: entered amount has to be divisible by five");
        } 
        else 
        {
            balance -= sum; // 👈 updates balance
            System.out.println("Cash is Coming...");
            System.out.println("Withdrawn: " + sum + " euros");
            System.out.println("Remaining balance: " + balance + " euros");
        }
    }

    // deposit money - ruhan
    public void deposit() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You can only deposit up to 1600 EUROS at a time.");

        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();

        if (amount <= 0) 
        {
            System.out.println("Invalid amount.");
        } 
        else if (amount > 1600) 
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