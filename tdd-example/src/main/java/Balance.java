public class Balance {
    private int balance;

    public Balance(){
        /*this.balance = balance;*/
    }

    public int getBalance() {
        return balance;
    }

    public void add(NaturalNumber naturalNumber) {
        this.balance += naturalNumber.getNaturalnumber();
    }

    public void subtract(NaturalNumber naturalNumber) throws IllegalAccessException {
        if(naturalNumber.getNaturalnumber() > this.balance){
            throw new IllegalAccessException();
        }
        this.balance -= naturalNumber.getNaturalnumber();
    }
}
