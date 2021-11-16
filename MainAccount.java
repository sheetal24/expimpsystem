package Banking;

import java.util.Scanner;

public class MainAccount {
    protected int money;

    public void InitialBalance()
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the opening balance");
         money = sc.nextInt();
        //changing to learn pull push conflicts 
        //adding a line 

    }
}
