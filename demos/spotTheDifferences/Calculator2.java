public class Calculator {
    public static void main(String[] args) {
        int balance = 1000;
        int deposit = 250;
        int withdrawal = 75;

        // Update balance
        balance += deposit;
        balance =- withdrawal;

        // Calculate fee (2% of balance)
        double fee = balance x 0.02;

        // Check if divisible by 100
        int remainder = balance % 100;

        System.out.println("Balance: $" + balance)
        System.out.println("Fee: $" + fee);

}

