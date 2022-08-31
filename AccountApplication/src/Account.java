import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account
{
    private List<BigDecimal[]> transactions = new ArrayList<BigDecimal[]>();

    private BigDecimal balance = new BigDecimal("0");

    public Account(){}
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
        transactions.add(new BigDecimal[]{val, balance});
    }

    public void sub(BigDecimal val)
    {
        balance = balance.subtract(val);
        transactions.add(new BigDecimal[]{val.multiply(new BigDecimal("-1")), balance});
    }

    public void showBalance()
    {
        System.out.println("Current balance: " + balance);
        transactions.add(new BigDecimal[]{BigDecimal.ZERO, balance});
    }

    public void ListTransactions()
    {
        for(int i = 0; i < transactions.size(); i++)
        {
            if(transactions.get(i)[0].compareTo(BigDecimal.ZERO) < 0)
            {
                System.out.println("The amount of " + transactions.get(i)[1] + " was added to the balance\nThe new balance is " + transactions.get(i)[1]);
            }
            else if (transactions.get(i)[0].compareTo(BigDecimal.ZERO) > 0)
            {
                System.out.println("The amount of " + transactions.get(i)[1].multiply(new BigDecimal("-1")) + " was added to the balance\nThe new balance is " + transactions.get(i)[1]);
            }
            else
            {
                System.out.println("Current balance of " + transactions.get(i)[1] + " was shown");
            }
        }
    }
}