class Bank
{
    // Withdraw method
    static void Withdraw(int balance, int withdrawAmount)
    {
        // Check balance
        if(withdrawAmount > balance)
        {
            // Throw exception
            throw new ArithmeticException("Insufficient Balance");
        }
        else
        {
            balance = balance - withdrawAmount;
            System.out.println("Remaining Balance = " + balance);
        }
    }

    public static void main(String args[])
    {
        int balance = 1000;
        int withdrawAmount = 12000;

        try
        {
            // Calling Withdraw method
            Withdraw(balance, withdrawAmount);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program Ended");
    }
}
