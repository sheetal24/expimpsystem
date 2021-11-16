package Banking;

public class Deposit extends MainAccount
{
    public int DepositAmount(int dep)
    {
       //modify
	// learn git conflict pull push rejection
        money = money + dep;
        System.out.println("Account Balance after deposit is : "+money);
        return (money);
//changes after stage
    }
}
