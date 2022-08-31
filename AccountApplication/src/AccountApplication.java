import java.math.BigDecimal;

public class AccountApplication
{

    public static void main(String[] args)
    {
        Account acc = new Account(new BigDecimal("0"));
        System.out.println("Welcome to the account application\nPlease enter the amount, 0 (zero) to terminate");

        BigDecimal amount = Input.getDecimal();

        while(amount.compareTo(BigDecimal.ZERO) != 0)
        {
            System.out.println("To deposit, press +, to withdraw, press -");
            char operation = Input.getChar();
            switch (operation) {
                case '+' -> acc.add(amount);
                case '-' -> acc.sub(amount);
                case '=' -> acc.showBalance();
                default -> System.out.println("No valid operation chosen, transaction canceled");
            }

            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = Input.getDecimal();
        }

        System.out.println("Final balance: " + acc.getBalance());
    }
}