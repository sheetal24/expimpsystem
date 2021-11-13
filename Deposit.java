package Banking;

public class Deposit extends MainAccount
{
    public int DepositAmount(int dep)
    {
        money = money + dep;
        System.out.println("Account Balance after deposit is : "+money);
        return (money);
    }
}
