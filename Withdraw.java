package Banking;

public class Withdraw extends Deposit
{
    public void Withdraw(int amt)
    {
        money = money - amt;
        System.out.println("balance after Withdrawal is "+money);
    }

    public static void main(String args[])
    {
        Withdraw withdraw = new Withdraw();
        withdraw.InitialBalance();
        withdraw.DepositAmount(2000);
        withdraw.Withdraw(500);

    }
}
