import java.math.BigDecimal;

public class Account
{
    private BigDecimal balance;

    public Account(BigDecimal openingBalance)
    {
        balance = openingBalance;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public void add(BigDecimal val)
    {
        balance = balance.add(val);
    }

    public void sub(BigDecimal val)
    {
        balance = balance.subtract(val);
    }

    public void showBalance()
    {
        System.out.println("Current balance: " + balance);
    }
}