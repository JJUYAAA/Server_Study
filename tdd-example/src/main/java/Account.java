public class Account {

    private Balance balance;

    public Account(Balance balance){
        this.balance = balance;
    }

    public Account(Balance balance,NaturalNumber naturalNumber) throws IllegalAccessException {
        this.balance = balance;
        deposit(naturalNumber);
    }

    public static Account createAccountEmpty(Balance balance){
        return new Account(balance);
    }
    public static Account createAccountWithInitialDeposit(Balance balance, NaturalNumber naturalNumber) throws IllegalAccessException {
        Account account = new Account(balance);
        account.deposit(naturalNumber);
        return account;
    }

    public int getBalance(){
        return this.balance.getBalance();
    }

    public void deposit(NaturalNumber naturalNumber) throws IllegalAccessException {
        this.balance.add(naturalNumber);
    }

    public void withdraw(NaturalNumber naturalNumber) throws IllegalAccessException {

        this.balance.subtract(naturalNumber);
    }
}
